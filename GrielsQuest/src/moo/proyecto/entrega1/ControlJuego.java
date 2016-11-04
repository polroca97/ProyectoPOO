
package moo.proyecto.entrega1;

public class ControlJuego {

// Añadir código especificado por el javadoc.

    /**
     * Método que crea y añade 6 objetos nivel y los añade a la secuencia 
     * de niveles.
     */
    public void cargaNiveles() {
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "   #            ".toCharArray(),
                        "  #L#           ".toCharArray(),
                        "  # #           ".toCharArray(),
                        "  # #           ".toCharArray(),
                        "  # #########   ".toCharArray(),
                        "  #J        P#  ".toCharArray(),
                        "   ##########   ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        " ############## ".toCharArray(),
                        "#S      J H L P#".toCharArray(),
                        " ############## ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));

        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "       #        ".toCharArray(),
                        "      #H#       ".toCharArray(),
                        "      # #       ".toCharArray(),
                        "  ####  ####### ".toCharArray(),
                        " # J   S F L P# ".toCharArray(),
                        "  ##### ######  ".toCharArray(),
                        "      # #       ".toCharArray(),
                        "      #A#       ".toCharArray(),
                        "       #        ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "#   #  #  #   # ".toCharArray(),
                        "## ## # # #  # #".toCharArray(),
                        "# # # # # #  ###".toCharArray(),
                        "#   #  #  ## # #".toCharArray(),
                        "      ###       ".toCharArray(),
                        "######R  #######".toCharArray(),
                        "#LTTFS   HHARP##".toCharArray(),
                        "####AS   #######".toCharArray(),
                        "    ##J  #      ".toCharArray(),
                        "#   ###  ###  ##".toCharArray(),
                        " ###   ##   ##  ".toCharArray(),
                        " #  # #  # #  # ".toCharArray(),
                        " ###  #  # #  # ".toCharArray(),
                        " #     ##   ##  ".toCharArray()}));


        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        " ##########     ".toCharArray(),
                        " #TF## J  ####  ".toCharArray(),
                        " ##AH  ##T RS#  ".toCharArray(),
                        " ####F####H#### ".toCharArray(),
                        " #P # SHR T# L# ".toCharArray(),
                        " #   ##  ##   # ".toCharArray(),
                        " ### FTR AR ### ".toCharArray(),
                        "   #  F##R  #   ".toCharArray(),
                        "   ### ##A###   ".toCharArray(),
                        "     ######     ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "################".toCharArray(),
                        "#      J       #                ".toCharArray(),
                        "#      T       #                ".toCharArray(),
                        "#RRRRRRRRRRRRR#                ".toCharArray(),
                        " #RAHHFTFSFRT#               ".toCharArray(),
                        "  #FTFSFHFSH#              ".toCharArray(),
                        "   #HAHTFRH#             ".toCharArray(),
                        "    #HRFRA#            ".toCharArray(),
                        "     #FRR#           ".toCharArray(),
                        "      #L#          ".toCharArray(),
                        "      #P#         ".toCharArray(),
                        "      ###          ".toCharArray(),
                        "                ".toCharArray()
                }));
    }
}
