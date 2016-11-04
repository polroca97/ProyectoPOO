package moo.proyecto.gui;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import moo.proyecto.entrega1.Const;

/**
 * @author mmacias
 */
/**
 * Esta clase implementa la interfaz gr√°fica de usuario que usar√° el programa.
 * NO TEN√âIS QUE GENERAR C√ìDIGO: OS VIENE DADA
 *
 */
public class InterfazGrafica {

    /**
     * C√≥digo num√©rico para detectar que se ha pulsado la tecla para mover el
     * personaje hacia arriba
     */
    public static final int TECLA_ARRIBA = 0;
    /**
     * C√≥digo num√©rico para detectar que se ha pulsado la tecla para mover el
     * personaje hacia abajo
     */
    public static final int TECLA_ABAJO = 1;
    /**
     * C√≥digo num√©rico para detectar que se ha pulsado la tecla para mover el
     * personaje hacia la izquierda
     */
    public static final int TECLA_IZQUIERDA = 2;
    /**
     * C√≥digo num√©rico para detectar que se ha pulsado la tecla para mover el
     * personaje hacia la derecha
     */
    public static final int TECLA_DERECHA = 3;
    /**
     * C√≥digo num√©rico para detectar que se ha pulsado la tecla R que comenzar√°
     * de nuevo el nivel.
     */
    public static final int TECLA_R = 4;

    /**
     * Tama√±o de cada columna y fila de cada escena
     */
    private static final int TILE_SIZE = 48;

    /**
     * Velocidad de animaci√≥n
     */
    private static final long ANIMATION_SPEED_NS = 600000000;

    /**
     * Ancho total de la escena
     */
    private static int sceneWidth;
    /**
     * Altura total de la escena
     */
    private static int sceneHeight;

    /**
     * Cola que contiene los c√≥digos num√©ricos correspondientes a las teclas 
     * pulsadas por el usuario
     */
    private static Queue<Integer> entradaCursor = new LinkedList<>();

    /**
     * Matriz de im√°genes para presentar el recinto de juego
     */
    private static ImageInfo[][] pieces = new ImageInfo[Const.NIVEL_COLUMNAS][Const.NIVEL_FILAS];

    /**
     * Mapa que mapea el nombre de un archivo con la imagen correspondiente.
     */
    private HashMap<String, ImageInfo> images = new HashMap<>();

    /**
     * Constructor. Crea una interfaz gr√°fica con el n√∫mero de filas y columnas
     * indicadas por los argumento
     *
     * @param filas el n√∫mero de filas
     * @param columnas el n√∫mero de columnas
     */
    public InterfazGrafica(int filas, int columnas) {
        sceneWidth = columnas * TILE_SIZE;
        sceneHeight = filas * TILE_SIZE;
        new Thread(
                () -> mostrar()
        ).start();
    }

    /**
     * Devuelve un c√≥digo num√©rico en funci√≥n de la tecla que el usuario 
     * haya pulsado.
     * @return el c√≥digo de la tecla pulsada.
     */
    public int leeTeclaPulsada() {
        while (entradaCursor.isEmpty()) {
            try {
                synchronized (entradaCursor) {
                    entradaCursor.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return entradaCursor.poll();
    }

    /**
     * Coloca una cierta imagen en una posici√≥n de la matriz del recinto. 
     * La imagen est√° depositada en un archivo cuyo nombre se pasa como argumento.
     * @param archivo nombre del archivo que contiene la imagen
     * @param fila el n√∫mero de fila de la celda en la que la imagen debe colocarse
     * @param col el n√∫mero de columna de la celda en la que la imagen debe colocarse
     */
    public void colocaImagen(String archivo, int fila, int col) {
        if (fila >= 0 && fila < Const.NIVEL_FILAS && col >= 0 && col < Const.NIVEL_COLUMNAS) {
            if (archivo == null) {
                pieces[col][fila] = null;

            } else {
                pieces[col][fila] = get(archivo);
            }
        }
    }

    /**
     * Consigue la imagen almacenada en el archivo cuyo nombre se pasa como argumento 
     * y a√±ade una nueva entrada en el mapa que contiene objetos con informaci√≥n de 
     * im√°genes
     * @param path el nombre del archivo
     * @return el objeto ImageInfo con informaci√≥n de la imagen
     */
    ImageInfo get(String path) {
        ImageInfo ii = images.get(path);
        if (ii == null) {
            ii = new ImageInfo();
            System.out.println("path = " + path);
            ii.image = new Image(getClass().getResourceAsStream(path));
            ii.frameSize = (int) ii.image.getHeight();
            ii.frames = (int) (ii.image.getWidth() / ii.frameSize);
            images.put(path, ii);
        }
        return ii;
    }

    /**
     * Clase privada: ImageInfo. Contiene informaci√≥n de una cierta imagen
     */
    private class ImageInfo {

        /**
         * El objeto instancia de clase Image, que se presentar√° por pantalla
         */
        Image image;
        /*
        El tama√±o en altura de la trama de la imagen
        */
        int frameSize;
        /*
        La relaci√≥n entre la anchura de la imagen y su altura
        */
        int frames;
    }

    /**
     * Clase est√°tica subclase de Application
     */
    public static class GUIApplication extends Application {

        /**
         * La escena del juego
         */
        Scene gameScene;
        /**
         * Una imagen del interfaz
         */
        Canvas sceneCanvas;
        /**
         * El objeto que actualiza la imagen
         */
        private Updater timer;
        /**
         * Contenedor para la interfaz gr√°fica de usuario
         */
        Stage primaryStage;

        /**
         * Inicia la interfaz gr√°fica de usuario.
         * @throws Exception lanza un objeto Exception si se produce alguna 
         * situaci√≥n an√≥mala.
         */
        @Override
        public void init() throws Exception {
            super.init(); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         * Da comienzo a la construcci√≥n y presentaci√≥n del interfaz gr√°fico de usuario.
         * Lee pulsaciones de teclas desde el teclado y las procesa, ordenando el dibujado 
         * o borrado de diferentes im√°genes en el GUI.
         * @param primaryStage el contenedor del GUI
         * @throws Exception lanza una excepci√≥n si se produce alguna situaci√≥n 
         * an√≥mala.
         */
        @Override
        public void start(Stage primaryStage) throws Exception {
            this.primaryStage = primaryStage;
            this.primaryStage.setOnCloseRequest(event -> System.exit(0));
            primaryStage.setTitle("¬°Escapada!");
            Group root = new Group();
            sceneCanvas = new Canvas(sceneWidth, sceneHeight);

            root.getChildren().add(sceneCanvas);
            gameScene = new Scene(root, sceneWidth, sceneHeight, false, SceneAntialiasing.DISABLED);

            gameScene.setOnKeyPressed(event -> {
                synchronized (entradaCursor) {
                    boolean wasEmpty = entradaCursor.isEmpty();

                    switch (event.getCode()) {
                        case R:
                            entradaCursor.add(TECLA_R);
                            break;
                        case UP:
                        case KP_UP:
                            entradaCursor.add(TECLA_ARRIBA);
                            break;
                        case DOWN:
                        case KP_DOWN:
                            entradaCursor.add(TECLA_ABAJO);
                            break;
                        case LEFT:
                        case KP_LEFT:
                            entradaCursor.add(TECLA_IZQUIERDA);
                            break;
                        case RIGHT:
                        case KP_RIGHT:
                            entradaCursor.add(TECLA_DERECHA);
                            break;
                    }

                    if (wasEmpty && !entradaCursor.isEmpty()) {
                        entradaCursor.notify();
                    }
                }
            });
            primaryStage.setScene(gameScene);

            ResizeListener rl = new ResizeListener();
            primaryStage.widthProperty().addListener(rl);
            primaryStage.heightProperty().addListener(rl);

            resizeCanvas();

            timer = new Updater(this);
            primaryStage.show();
            timer.start();
        }

        /**
         * Permite cambiar el tama√±o de la imagen
         */
        void resizeCanvas() {
            double scaleX = gameScene.getWidth() / sceneWidth;
            double scaleY = gameScene.getHeight() / sceneHeight;
            double scale = Math.min(scaleX, scaleY);
            sceneCanvas.setScaleX(scale);
            sceneCanvas.setScaleY(scale);
            sceneCanvas.setTranslateX((gameScene.getWidth() - sceneWidth) / 2);
            sceneCanvas.setTranslateY((gameScene.getHeight() - sceneHeight) / 2);
        }


        @Override
        public void stop() throws Exception {
            timer.stop();
            super.stop(); //To change body of generated methods, choose Tools | Templates.
        }

        private class ResizeListener implements ChangeListener<Number> {

            /**
             * Permite cambiar el tama√±o de la ventana
             */
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number t, Number t1) {
                resizeCanvas();

//                sceneCanvas.setScaleY(primaryStage.getHeight()/sceneHeight);
//                sceneCanvas.setWidth(primaryStage.getWidth());
//                sceneCanvas.setHeight(primaryStage.getHeight());
            }
        }

        /**
         * Clase privada que permite crear un timer para actualizar las tramas 
         * del GUI.
         */
        private class Updater extends AnimationTimer {

            private Random rnd = new Random();

            private GUIApplication guiApp;

            public Updater(GUIApplication guiApp) {
                this.guiApp = guiApp;
            }


            @Override
            public void handle(long l) {
                GraphicsContext gc = guiApp.sceneCanvas.getGraphicsContext2D();
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, sceneWidth, sceneHeight);

                for (int col = 0; col < Const.NIVEL_COLUMNAS; col++) {
                    for (int row = 0; row < Const.NIVEL_FILAS; row++) {
                        ImageInfo ii = pieces[col][row];
                        if (ii != null) {
                            int animationIndex = (int) ((l / ANIMATION_SPEED_NS) % ii.frames);
                            gc.drawImage(ii.image, animationIndex * ii.frameSize, 0, ii.frameSize, ii.frameSize,
                                    col * TILE_SIZE, row * TILE_SIZE, ii.frameSize, ii.frameSize);

                        }
                    }
                }
            }
        }

    }

    private boolean isLaunched = false;

    void mostrar() {
        if (!isLaunched) {
            isLaunched = true;
            //GUIApplication.launch(new String[0]);
            Application.launch(GUIApplication.class, new String[0]);
        }
    }

    public void mensaje(String texto) {
        System.out.println(texto);
    }

    public void error(String texto) {
        System.err.println(texto);
    }

}

