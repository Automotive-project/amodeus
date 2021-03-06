/* amodeus - Copyright (c) 2018, ETH Zurich, Institute for Dynamic Systems and Control */
package ch.ethz.idsc.amodeus.view.gheat.gui;

import java.awt.Color;

/* package */ class GheatPalettes {

    public static ColorScheme createFire() {
        int[][] sum = new int[][] { { 255, 255, 255, 255 }, { 255, 255, 253, 255 }, { 255, 255, 250, 255 }, { 255, 255, 247, 255 }, { 255, 255, 244, 255 }, { 255, 255, 241, 255 },
                { 255, 255, 238, 255 }, { 255, 255, 234, 255 }, { 255, 255, 231, 255 }, { 255, 255, 227, 255 }, { 255, 255, 223, 255 }, { 255, 255, 219, 255 },
                { 255, 255, 214, 255 }, { 255, 255, 211, 255 }, { 255, 255, 206, 255 }, { 255, 255, 202, 255 }, { 255, 255, 197, 255 }, { 255, 255, 192, 255 },
                { 255, 255, 187, 255 }, { 255, 255, 183, 255 }, { 255, 255, 178, 255 }, { 255, 255, 172, 255 }, { 255, 255, 167, 255 }, { 255, 255, 163, 255 },
                { 255, 255, 157, 255 }, { 255, 255, 152, 255 }, { 255, 255, 147, 255 }, { 255, 255, 142, 255 }, { 255, 255, 136, 255 }, { 255, 255, 132, 255 },
                { 255, 255, 126, 255 }, { 255, 255, 121, 255 }, { 255, 255, 116, 255 }, { 255, 255, 111, 255 }, { 255, 255, 106, 255 }, { 255, 255, 102, 255 },
                { 255, 255, 97, 255 }, { 255, 255, 91, 255 }, { 255, 255, 87, 255 }, { 255, 255, 82, 255 }, { 255, 255, 78, 255 }, { 255, 255, 74, 255 }, { 255, 255, 70, 255 },
                { 255, 255, 65, 255 }, { 255, 255, 61, 255 }, { 255, 255, 57, 255 }, { 255, 255, 53, 255 }, { 255, 255, 50, 255 }, { 255, 255, 46, 255 }, { 255, 255, 43, 255 },
                { 255, 255, 39, 255 }, { 255, 255, 38, 255 }, { 255, 255, 34, 255 }, { 255, 255, 31, 255 }, { 255, 255, 29, 255 }, { 255, 255, 26, 255 }, { 255, 255, 25, 255 },
                { 255, 254, 23, 255 }, { 255, 251, 22, 255 }, { 255, 250, 22, 255 }, { 255, 247, 23, 255 }, { 255, 245, 23, 255 }, { 255, 242, 24, 255 }, { 255, 239, 24, 255 },
                { 255, 236, 25, 255 }, { 255, 232, 25, 255 }, { 255, 229, 26, 255 }, { 255, 226, 26, 255 }, { 255, 222, 27, 255 }, { 255, 218, 27, 255 }, { 255, 215, 28, 255 },
                { 255, 210, 28, 255 }, { 255, 207, 29, 255 }, { 255, 203, 29, 255 }, { 255, 199, 30, 255 }, { 255, 194, 30, 255 }, { 255, 190, 31, 255 }, { 255, 186, 31, 255 },
                { 255, 182, 32, 255 }, { 255, 176, 32, 255 }, { 255, 172, 33, 255 }, { 255, 168, 34, 255 }, { 255, 163, 34, 255 }, { 255, 159, 35, 255 }, { 255, 154, 35, 255 },
                { 255, 150, 36, 255 }, { 255, 145, 36, 255 }, { 255, 141, 37, 255 }, { 255, 136, 37, 255 }, { 255, 132, 38, 255 }, { 255, 128, 39, 255 }, { 255, 124, 39, 255 },
                { 255, 119, 40, 255 }, { 255, 115, 40, 255 }, { 255, 111, 41, 255 }, { 255, 107, 41, 255 }, { 255, 103, 42, 255 }, { 255, 99, 42, 255 }, { 255, 95, 43, 255 },
                { 255, 92, 44, 255 }, { 255, 89, 44, 255 }, { 255, 85, 45, 255 }, { 255, 81, 45, 255 }, { 255, 79, 46, 255 }, { 255, 76, 47, 255 }, { 255, 72, 47, 255 },
                { 255, 70, 48, 255 }, { 255, 67, 48, 255 }, { 255, 65, 49, 255 }, { 255, 63, 50, 255 }, { 255, 60, 50, 255 }, { 255, 59, 51, 255 }, { 255, 57, 51, 255 },
                { 255, 55, 52, 255 }, { 255, 55, 53, 255 }, { 255, 53, 53, 255 }, { 253, 54, 54, 255 }, { 253, 54, 54, 255 }, { 251, 55, 55, 255 }, { 250, 56, 56, 255 },
                { 248, 56, 56, 255 }, { 247, 57, 57, 255 }, { 246, 57, 57, 255 }, { 244, 58, 58, 255 }, { 242, 59, 59, 255 }, { 240, 59, 59, 255 }, { 239, 60, 60, 255 },
                { 238, 61, 61, 255 }, { 235, 61, 61, 255 }, { 234, 62, 62, 255 }, { 232, 62, 62, 255 }, { 229, 63, 63, 255 }, { 228, 64, 64, 255 }, { 226, 64, 64, 255 },
                { 224, 65, 65, 255 }, { 222, 66, 66, 255 }, { 219, 66, 66, 255 }, { 218, 67, 67, 255 }, { 216, 67, 67, 255 }, { 213, 68, 68, 255 }, { 211, 69, 69, 255 },
                { 209, 69, 69, 255 }, { 207, 70, 70, 255 }, { 205, 71, 71, 255 }, { 203, 71, 71, 255 }, { 200, 72, 72, 255 }, { 199, 73, 73, 255 }, { 196, 73, 73, 255 },
                { 194, 74, 74, 255 }, { 192, 74, 74, 255 }, { 190, 75, 75, 255 }, { 188, 76, 76, 255 }, { 186, 76, 76, 255 }, { 183, 77, 77, 255 }, { 181, 78, 78, 255 },
                { 179, 78, 78, 255 }, { 177, 79, 79, 255 }, { 175, 80, 80, 255 }, { 173, 80, 80, 255 }, { 170, 81, 81, 255 }, { 169, 82, 82, 255 }, { 166, 82, 82, 255 },
                { 165, 83, 83, 255 }, { 162, 83, 83, 255 }, { 160, 84, 84, 255 }, { 158, 85, 85, 255 }, { 156, 85, 85, 255 }, { 154, 86, 86, 255 }, { 153, 87, 87, 255 },
                { 150, 87, 87, 255 }, { 149, 88, 88, 255 }, { 147, 89, 89, 255 }, { 146, 90, 90, 255 }, { 144, 91, 91, 255 }, { 142, 92, 92, 255 }, { 142, 94, 94, 255 },
                { 141, 95, 95, 255 }, { 140, 96, 96, 255 }, { 139, 98, 98, 255 }, { 138, 99, 99, 255 }, { 136, 100, 100, 255 }, { 135, 101, 101, 255 }, { 135, 103, 103, 255 },
                { 134, 104, 104, 255 }, { 133, 105, 105, 255 }, { 133, 107, 107, 255 }, { 132, 108, 108, 255 }, { 131, 109, 109, 255 }, { 132, 111, 111, 255 },
                { 131, 112, 112, 255 }, { 130, 113, 113, 255 }, { 130, 114, 114, 255 }, { 130, 116, 116, 255 }, { 130, 117, 117, 255 }, { 130, 118, 118, 255 },
                { 129, 119, 119, 255 }, { 130, 121, 121, 255 }, { 130, 122, 122, 255 }, { 130, 123, 123, 255 }, { 130, 124, 124, 255 }, { 131, 126, 126, 255 },
                { 131, 127, 127, 255 }, { 130, 128, 128, 255 }, { 131, 129, 129, 255 }, { 132, 131, 131, 255 }, { 132, 132, 132, 255 }, { 133, 133, 133, 255 },
                { 134, 134, 134, 255 }, { 135, 135, 135, 255 }, { 136, 136, 136, 255 }, { 138, 138, 138, 255 }, { 139, 139, 139, 255 }, { 140, 140, 140, 255 },
                { 141, 141, 141, 255 }, { 142, 142, 142, 255 }, { 143, 143, 143, 255 }, { 144, 144, 144, 255 }, { 145, 145, 145, 255 }, { 147, 147, 147, 255 },
                { 148, 148, 148, 255 }, { 149, 149, 149, 255 }, { 150, 150, 150, 255 }, { 151, 151, 151, 255 }, { 152, 152, 152, 255 }, { 153, 153, 153, 255 },
                { 154, 154, 154, 255 }, { 155, 155, 155, 255 }, { 156, 156, 156, 255 }, { 157, 157, 157, 255 }, { 158, 158, 158, 255 }, { 159, 159, 159, 255 },
                { 160, 160, 160, 255 }, { 160, 160, 160, 255 }, { 161, 161, 161, 255 }, { 162, 162, 162, 255 }, { 163, 163, 163, 255 }, { 164, 164, 164, 255 },
                { 165, 165, 165, 255 }, { 166, 166, 166, 255 }, { 167, 167, 167, 255 }, { 167, 167, 167, 255 }, { 168, 168, 168, 255 }, { 169, 169, 169, 255 },
                { 170, 170, 170, 255 }, { 170, 170, 170, 255 }, { 171, 171, 171, 255 }, { 172, 172, 172, 255 }, { 173, 173, 173, 255 }, { 173, 173, 173, 255 },
                { 174, 174, 174, 255 }, { 175, 175, 175, 255 }, { 175, 175, 175, 255 }, { 176, 176, 176, 255 }, { 176, 176, 176, 255 }, { 177, 177, 177, 255 },
                { 177, 177, 177, 255 } };

        ColorScheme colorScheme = new ColorScheme();
        for (int c = 0; c < 256; ++c)
            colorScheme.set(c, new Color(sum[c][0], sum[c][1], sum[c][2], 255 - c));
        return colorScheme;
    }

    public static ColorScheme createPbj() {
        int[][] sum = new int[][] { { 41, 10, 89, 255 }, { 41, 10, 89, 255 }, { 42, 10, 89, 255 }, { 42, 10, 89, 255 }, { 42, 10, 88, 255 }, { 43, 10, 88, 255 },
                { 43, 9, 88, 255 }, { 43, 9, 88, 255 }, { 44, 9, 88, 255 }, { 44, 9, 88, 255 }, { 45, 10, 89, 255 }, { 46, 10, 88, 255 }, { 46, 9, 88, 255 }, { 47, 9, 88, 255 },
                { 47, 9, 88, 255 }, { 47, 9, 88, 255 }, { 48, 8, 88, 255 }, { 48, 8, 87, 255 }, { 49, 8, 87, 255 }, { 49, 8, 87, 255 }, { 49, 7, 87, 255 }, { 50, 7, 87, 255 },
                { 50, 7, 87, 255 }, { 51, 7, 86, 255 }, { 51, 6, 86, 255 }, { 53, 7, 86, 255 }, { 53, 7, 86, 255 }, { 54, 7, 86, 255 }, { 54, 6, 85, 255 }, { 55, 6, 85, 255 },
                { 55, 6, 85, 255 }, { 56, 5, 85, 255 }, { 56, 5, 85, 255 }, { 57, 5, 84, 255 }, { 57, 5, 84, 255 }, { 58, 4, 84, 255 }, { 59, 4, 84, 255 }, { 59, 5, 84, 255 },
                { 60, 4, 84, 255 }, { 60, 4, 84, 255 }, { 61, 4, 84, 255 }, { 61, 4, 83, 255 }, { 62, 3, 83, 255 }, { 63, 3, 83, 255 }, { 63, 3, 83, 255 }, { 64, 3, 82, 255 },
                { 64, 3, 82, 255 }, { 65, 3, 82, 255 }, { 66, 3, 82, 255 }, { 67, 4, 82, 255 }, { 68, 4, 82, 255 }, { 69, 4, 82, 255 }, { 69, 4, 81, 255 }, { 70, 4, 81, 255 },
                { 71, 4, 81, 255 }, { 71, 4, 80, 255 }, { 72, 4, 80, 255 }, { 73, 4, 80, 255 }, { 73, 4, 79, 255 }, { 75, 5, 80, 255 }, { 76, 5, 80, 255 }, { 77, 5, 79, 255 },
                { 77, 5, 79, 255 }, { 78, 5, 79, 255 }, { 79, 5, 78, 255 }, { 80, 5, 78, 255 }, { 80, 5, 78, 255 }, { 80, 5, 77, 255 }, { 81, 5, 77, 255 }, { 83, 6, 76, 255 },
                { 83, 6, 76, 255 }, { 84, 6, 76, 255 }, { 85, 6, 75, 255 }, { 86, 6, 75, 255 }, { 87, 6, 74, 255 }, { 88, 6, 74, 255 }, { 88, 6, 73, 255 }, { 89, 6, 73, 255 },
                { 91, 7, 73, 255 }, { 92, 7, 73, 255 }, { 93, 7, 72, 255 }, { 94, 7, 72, 255 }, { 94, 7, 71, 255 }, { 95, 7, 71, 255 }, { 96, 7, 70, 255 }, { 96, 7, 70, 255 },
                { 97, 7, 69, 255 }, { 99, 9, 70, 255 }, { 100, 9, 69, 255 }, { 101, 10, 69, 255 }, { 102, 10, 68, 255 }, { 103, 11, 67, 255 }, { 104, 11, 67, 255 },
                { 105, 12, 66, 255 }, { 106, 13, 66, 255 }, { 107, 14, 66, 255 }, { 108, 15, 65, 255 }, { 109, 16, 64, 255 }, { 110, 16, 64, 255 }, { 111, 17, 63, 255 },
                { 112, 18, 62, 255 }, { 113, 18, 61, 255 }, { 114, 19, 61, 255 }, { 115, 20, 60, 255 }, { 118, 22, 60, 255 }, { 119, 22, 59, 255 }, { 120, 22, 58, 255 },
                { 120, 23, 58, 255 }, { 121, 24, 57, 255 }, { 122, 25, 56, 255 }, { 124, 26, 55, 255 }, { 125, 27, 54, 255 }, { 127, 29, 54, 255 }, { 128, 30, 54, 255 },
                { 130, 31, 53, 255 }, { 131, 32, 52, 255 }, { 132, 33, 51, 255 }, { 133, 34, 50, 255 }, { 134, 35, 49, 255 }, { 135, 36, 48, 255 }, { 137, 38, 48, 255 },
                { 138, 39, 47, 255 }, { 140, 40, 46, 255 }, { 141, 41, 46, 255 }, { 142, 42, 45, 255 }, { 143, 42, 44, 255 }, { 144, 43, 43, 255 }, { 145, 44, 42, 255 },
                { 146, 45, 42, 255 }, { 149, 47, 41, 255 }, { 150, 48, 41, 255 }, { 151, 49, 40, 255 }, { 152, 50, 39, 255 }, { 153, 51, 38, 255 }, { 154, 52, 38, 255 },
                { 155, 53, 37, 255 }, { 157, 55, 36, 255 }, { 159, 57, 36, 255 }, { 160, 57, 35, 255 }, { 160, 58, 34, 255 }, { 162, 59, 33, 255 }, { 163, 60, 33, 255 },
                { 164, 61, 32, 255 }, { 165, 62, 31, 255 }, { 167, 63, 30, 255 }, { 168, 65, 30, 255 }, { 169, 66, 29, 255 }, { 170, 67, 29, 255 }, { 172, 68, 28, 255 },
                { 173, 69, 27, 255 }, { 174, 70, 26, 255 }, { 175, 71, 26, 255 }, { 176, 71, 25, 255 }, { 178, 73, 25, 255 }, { 179, 74, 24, 255 }, { 180, 75, 24, 255 },
                { 181, 76, 23, 255 }, { 182, 77, 23, 255 }, { 183, 78, 23, 255 }, { 184, 79, 22, 255 }, { 186, 80, 22, 255 }, { 187, 81, 21, 255 }, { 188, 82, 21, 255 },
                { 189, 83, 21, 255 }, { 190, 83, 20, 255 }, { 191, 84, 20, 255 }, { 192, 85, 19, 255 }, { 192, 86, 19, 255 }, { 193, 87, 18, 255 }, { 194, 87, 18, 255 },
                { 196, 89, 18, 255 }, { 196, 90, 18, 255 }, { 197, 90, 18, 255 }, { 198, 90, 18, 255 }, { 199, 91, 18, 255 }, { 200, 92, 18, 255 }, { 201, 93, 18, 255 },
                { 202, 93, 18, 255 }, { 203, 94, 18, 255 }, { 204, 96, 19, 255 }, { 204, 96, 19, 255 }, { 205, 97, 19, 255 }, { 206, 98, 19, 255 }, { 207, 99, 19, 255 },
                { 208, 99, 19, 255 }, { 209, 100, 19, 255 }, { 210, 100, 19, 255 }, { 211, 100, 19, 255 }, { 212, 102, 20, 255 }, { 213, 103, 20, 255 }, { 214, 103, 20, 255 },
                { 214, 104, 20, 255 }, { 215, 105, 20, 255 }, { 215, 105, 20, 255 }, { 216, 106, 20, 255 }, { 217, 107, 20, 255 }, { 218, 107, 20, 255 }, { 219, 108, 20, 255 },
                { 220, 109, 21, 255 }, { 221, 109, 21, 255 }, { 222, 110, 21, 255 }, { 222, 111, 21, 255 }, { 223, 111, 21, 255 }, { 224, 112, 21, 255 }, { 225, 113, 21, 255 },
                { 226, 113, 21, 255 }, { 227, 114, 21, 255 }, { 227, 114, 21, 255 }, { 228, 115, 22, 255 }, { 229, 116, 22, 255 }, { 229, 116, 22, 255 }, { 230, 117, 22, 255 },
                { 231, 117, 22, 255 }, { 231, 118, 22, 255 }, { 232, 119, 22, 255 }, { 233, 119, 22, 255 }, { 234, 120, 22, 255 }, { 234, 120, 22, 255 }, { 235, 121, 22, 255 },
                { 236, 121, 22, 255 }, { 237, 122, 23, 255 }, { 237, 122, 23, 255 }, { 238, 123, 23, 255 }, { 239, 124, 23, 255 }, { 239, 124, 23, 255 }, { 240, 125, 23, 255 },
                { 240, 125, 23, 255 }, { 241, 126, 23, 255 }, { 241, 126, 23, 255 }, { 242, 127, 23, 255 }, { 243, 127, 23, 255 }, { 243, 128, 23, 255 }, { 244, 128, 24, 255 },
                { 244, 128, 24, 255 }, { 245, 129, 24, 255 }, { 246, 129, 24, 255 }, { 246, 130, 24, 255 }, { 247, 130, 24, 255 }, { 247, 131, 24, 255 }, { 248, 131, 24, 255 },
                { 249, 131, 24, 255 }, { 249, 132, 24, 255 }, { 250, 132, 24, 255 }, { 250, 133, 24, 255 }, { 250, 133, 24, 255 }, { 250, 133, 24, 255 }, { 251, 134, 24, 255 },
                { 251, 134, 25, 255 }, { 252, 135, 25, 255 }, { 252, 135, 25, 255 }, { 253, 135, 25, 255 }, { 253, 136, 25, 255 }, { 253, 136, 25, 255 }, { 254, 136, 25, 255 },
                { 254, 136, 25, 255 }, { 255, 137, 25, 255 } };

        ColorScheme colorScheme = new ColorScheme();
        for (int c = 0; c < 256; ++c)
            colorScheme.set(c, new Color(sum[c][0], sum[c][1], sum[c][2], 255 - c));
        return colorScheme;
    }

    public static ColorScheme createPgaitch() {
        int[][] sum = new int[][] { { 255, 254, 165, 255 }, { 255, 254, 164, 255 }, { 255, 253, 163, 255 }, { 255, 253, 162, 255 }, { 255, 253, 161, 255 }, { 255, 252, 160, 255 },
                { 255, 252, 159, 255 }, { 255, 252, 157, 255 }, { 255, 251, 156, 255 }, { 255, 251, 155, 255 }, { 255, 251, 153, 255 }, { 255, 250, 152, 255 },
                { 255, 250, 150, 255 }, { 255, 250, 149, 255 }, { 255, 249, 148, 255 }, { 255, 249, 146, 255 }, { 255, 249, 145, 255 }, { 255, 248, 143, 255 },
                { 255, 248, 141, 255 }, { 255, 248, 139, 255 }, { 255, 247, 138, 255 }, { 255, 247, 136, 255 }, { 255, 246, 134, 255 }, { 255, 246, 132, 255 },
                { 255, 246, 130, 255 }, { 255, 245, 129, 255 }, { 255, 245, 127, 255 }, { 255, 245, 125, 255 }, { 255, 244, 123, 255 }, { 255, 244, 121, 255 },
                { 255, 243, 119, 255 }, { 255, 243, 117, 255 }, { 255, 242, 114, 255 }, { 255, 242, 112, 255 }, { 255, 241, 111, 255 }, { 255, 241, 109, 255 },
                { 255, 240, 107, 255 }, { 255, 240, 105, 255 }, { 255, 239, 102, 255 }, { 255, 239, 100, 255 }, { 255, 238, 99, 255 }, { 255, 238, 97, 255 }, { 255, 237, 95, 255 },
                { 255, 237, 92, 255 }, { 255, 236, 90, 255 }, { 255, 237, 89, 255 }, { 255, 236, 87, 255 }, { 255, 235, 84, 255 }, { 255, 235, 82, 255 }, { 255, 234, 80, 255 },
                { 255, 233, 79, 255 }, { 255, 233, 77, 255 }, { 255, 232, 74, 255 }, { 255, 231, 72, 255 }, { 255, 230, 70, 255 }, { 255, 230, 69, 255 }, { 255, 229, 67, 255 },
                { 255, 228, 65, 255 }, { 255, 227, 63, 255 }, { 255, 226, 61, 255 }, { 255, 225, 60, 255 }, { 255, 225, 58, 255 }, { 255, 224, 56, 255 }, { 255, 223, 54, 255 },
                { 255, 222, 52, 255 }, { 255, 222, 51, 255 }, { 255, 221, 49, 255 }, { 255, 220, 47, 255 }, { 255, 219, 46, 255 }, { 255, 218, 44, 255 }, { 255, 216, 43, 255 },
                { 255, 215, 42, 255 }, { 255, 214, 41, 255 }, { 255, 213, 39, 255 }, { 255, 212, 39, 255 }, { 255, 211, 37, 255 }, { 255, 209, 36, 255 }, { 255, 208, 34, 255 },
                { 255, 208, 33, 255 }, { 255, 206, 33, 255 }, { 255, 205, 32, 255 }, { 255, 204, 30, 255 }, { 255, 202, 29, 255 }, { 255, 201, 29, 255 }, { 255, 199, 28, 255 },
                { 254, 199, 28, 255 }, { 254, 199, 27, 255 }, { 253, 198, 27, 255 }, { 252, 197, 27, 255 }, { 251, 196, 27, 255 }, { 250, 195, 26, 255 }, { 249, 195, 26, 255 },
                { 248, 194, 26, 255 }, { 248, 193, 26, 255 }, { 247, 192, 26, 255 }, { 246, 192, 25, 255 }, { 245, 191, 26, 255 }, { 244, 190, 26, 255 }, { 243, 189, 25, 255 },
                { 241, 188, 25, 255 }, { 240, 187, 25, 255 }, { 239, 187, 25, 255 }, { 238, 186, 25, 255 }, { 236, 185, 25, 255 }, { 236, 184, 26, 255 }, { 235, 183, 26, 255 },
                { 233, 182, 25, 255 }, { 232, 181, 25, 255 }, { 230, 181, 26, 255 }, { 229, 180, 26, 255 }, { 228, 179, 25, 255 }, { 227, 178, 25, 255 }, { 226, 177, 26, 255 },
                { 224, 176, 26, 255 }, { 222, 176, 25, 255 }, { 221, 175, 25, 255 }, { 220, 173, 26, 255 }, { 219, 172, 26, 255 }, { 217, 171, 25, 255 }, { 215, 170, 25, 255 },
                { 214, 170, 26, 255 }, { 212, 169, 26, 255 }, { 211, 167, 25, 255 }, { 209, 166, 25, 255 }, { 208, 166, 26, 255 }, { 206, 165, 26, 255 }, { 204, 163, 26, 255 },
                { 203, 162, 26, 255 }, { 202, 161, 25, 255 }, { 200, 161, 26, 255 }, { 198, 159, 26, 255 }, { 197, 158, 26, 255 }, { 195, 157, 26, 255 }, { 193, 157, 27, 255 },
                { 192, 155, 27, 255 }, { 190, 154, 27, 255 }, { 189, 153, 27, 255 }, { 187, 152, 28, 255 }, { 186, 151, 28, 255 }, { 184, 150, 28, 255 }, { 182, 149, 28, 255 },
                { 181, 148, 29, 255 }, { 179, 147, 29, 255 }, { 177, 146, 29, 255 }, { 175, 144, 29, 255 }, { 174, 144, 30, 255 }, { 172, 142, 30, 255 }, { 170, 141, 30, 255 },
                { 169, 140, 30, 255 }, { 167, 139, 31, 255 }, { 165, 138, 31, 255 }, { 164, 137, 31, 255 }, { 162, 136, 31, 255 }, { 161, 135, 32, 255 }, { 159, 134, 32, 255 },
                { 157, 133, 32, 255 }, { 154, 132, 32, 255 }, { 153, 131, 33, 255 }, { 151, 130, 33, 255 }, { 150, 129, 33, 255 }, { 148, 127, 33, 255 }, { 147, 127, 34, 255 },
                { 145, 126, 34, 255 }, { 143, 124, 34, 255 }, { 141, 123, 34, 255 }, { 140, 122, 35, 255 }, { 139, 121, 35, 255 }, { 137, 120, 35, 255 }, { 135, 119, 35, 255 },
                { 134, 118, 36, 255 }, { 132, 117, 36, 255 }, { 130, 116, 36, 255 }, { 129, 115, 36, 255 }, { 127, 113, 36, 255 }, { 126, 113, 37, 255 }, { 124, 112, 37, 255 },
                { 122, 111, 37, 255 }, { 121, 110, 37, 255 }, { 120, 109, 38, 255 }, { 118, 108, 38, 255 }, { 116, 107, 38, 255 }, { 115, 105, 38, 255 }, { 113, 104, 38, 255 },
                { 112, 104, 39, 255 }, { 110, 103, 39, 255 }, { 108, 102, 39, 255 }, { 107, 101, 39, 255 }, { 106, 100, 40, 255 }, { 104, 99, 40, 255 }, { 102, 98, 40, 255 },
                { 101, 96, 40, 255 }, { 99, 96, 40, 255 }, { 99, 96, 41, 255 }, { 97, 94, 41, 255 }, { 96, 93, 41, 255 }, { 94, 92, 41, 255 }, { 92, 91, 41, 255 },
                { 92, 90, 42, 255 }, { 90, 90, 42, 255 }, { 89, 89, 42, 255 }, { 87, 87, 42, 255 }, { 86, 86, 42, 255 }, { 85, 86, 43, 255 }, { 84, 85, 43, 255 },
                { 83, 84, 43, 255 }, { 81, 83, 43, 255 }, { 80, 82, 43, 255 }, { 80, 82, 44, 255 }, { 78, 80, 44, 255 }, { 77, 80, 44, 255 }, { 75, 79, 44, 255 },
                { 75, 78, 44, 255 }, { 74, 78, 45, 255 }, { 73, 76, 45, 255 }, { 71, 75, 45, 255 }, { 71, 75, 45, 255 }, { 70, 74, 45, 255 }, { 69, 74, 46, 255 },
                { 68, 73, 46, 255 }, { 67, 72, 46, 255 }, { 66, 71, 46, 255 }, { 65, 71, 46, 255 }, { 64, 69, 46, 255 }, { 64, 69, 47, 255 }, { 63, 68, 47, 255 },
                { 62, 67, 47, 255 }, { 61, 67, 47, 255 }, { 60, 66, 47, 255 }, { 59, 65, 47, 255 }, { 59, 65, 48, 255 }, { 59, 64, 48, 255 }, { 58, 63, 48, 255 },
                { 57, 63, 48, 255 }, { 56, 62, 48, 255 }, { 56, 62, 48, 255 }, { 55, 61, 48, 255 }, { 55, 61, 49, 255 }, { 55, 60, 49, 255 }, { 55, 60, 49, 255 },
                { 54, 59, 49, 255 }, { 53, 58, 49, 255 }, { 53, 57, 49, 255 }, { 52, 57, 49, 255 }, { 52, 57, 50, 255 }, { 52, 56, 50, 255 }, { 52, 56, 50, 255 },
                { 52, 56, 50, 255 }, { 52, 55, 50, 255 }, { 51, 54, 50, 255 }, { 51, 53, 50, 255 }, { 51, 53, 50, 255 }, { 51, 52, 50, 255 }, { 51, 53, 51, 255 },
                { 51, 53, 51, 255 }, { 51, 52, 51, 255 }, { 51, 52, 51, 255 } };

        ColorScheme colorScheme = new ColorScheme();
        for (int c = 0; c < 256; ++c)
            colorScheme.set(c, new Color(sum[c][0], sum[c][1], sum[c][2], 255 - c));
        return colorScheme;
    }

    public static ColorScheme createOmg() {
        int[][] sum = new int[][] { { 255, 255, 255, 255 }, { 255, 254, 254, 255 }, { 255, 253, 253, 255 }, { 255, 251, 251, 255 }, { 255, 250, 250, 255 }, { 255, 249, 249, 255 },
                { 255, 247, 247, 255 }, { 255, 246, 246, 255 }, { 255, 244, 244, 255 }, { 255, 242, 242, 255 }, { 255, 241, 241, 255 }, { 255, 239, 239, 255 },
                { 255, 237, 237, 255 }, { 255, 235, 235, 255 }, { 255, 233, 233, 255 }, { 255, 231, 231, 255 }, { 255, 229, 229, 255 }, { 255, 227, 227, 255 },
                { 255, 226, 226, 255 }, { 255, 224, 224, 255 }, { 255, 222, 222, 255 }, { 255, 220, 220, 255 }, { 255, 217, 217, 255 }, { 255, 215, 215, 255 },
                { 255, 213, 213, 255 }, { 255, 210, 210, 255 }, { 255, 208, 208, 255 }, { 255, 206, 206, 255 }, { 255, 204, 204, 255 }, { 255, 202, 202, 255 },
                { 255, 199, 199, 255 }, { 255, 197, 197, 255 }, { 255, 194, 194, 255 }, { 255, 192, 192, 255 }, { 255, 189, 189, 255 }, { 255, 188, 188, 255 },
                { 255, 185, 185, 255 }, { 255, 183, 183, 255 }, { 255, 180, 180, 255 }, { 255, 178, 178, 255 }, { 255, 176, 176, 255 }, { 255, 173, 173, 255 },
                { 255, 171, 171, 255 }, { 255, 169, 169, 255 }, { 255, 167, 167, 255 }, { 255, 164, 164, 255 }, { 255, 162, 162, 255 }, { 255, 160, 160, 255 },
                { 255, 158, 158, 255 }, { 255, 155, 155, 255 }, { 255, 153, 153, 255 }, { 255, 151, 151, 255 }, { 255, 149, 149, 255 }, { 255, 147, 147, 255 },
                { 255, 145, 145, 255 }, { 255, 143, 143, 255 }, { 255, 141, 141, 255 }, { 255, 139, 139, 255 }, { 255, 137, 137, 255 }, { 255, 136, 136, 255 },
                { 255, 134, 134, 255 }, { 255, 132, 132, 255 }, { 255, 131, 131, 255 }, { 255, 129, 129, 255 }, { 255, 128, 128, 255 }, { 255, 127, 127, 255 },
                { 255, 127, 127, 255 }, { 255, 126, 126, 255 }, { 255, 125, 125, 255 }, { 255, 125, 125, 255 }, { 255, 124, 124, 255 }, { 255, 123, 122, 255 },
                { 255, 123, 122, 255 }, { 255, 122, 121, 255 }, { 255, 122, 121, 255 }, { 255, 121, 120, 255 }, { 255, 120, 119, 255 }, { 255, 119, 118, 255 },
                { 255, 119, 118, 255 }, { 255, 118, 116, 255 }, { 255, 117, 116, 255 }, { 255, 117, 115, 255 }, { 255, 115, 114, 255 }, { 255, 115, 114, 255 },
                { 255, 114, 113, 255 }, { 255, 114, 112, 255 }, { 255, 113, 111, 255 }, { 255, 113, 111, 255 }, { 255, 112, 110, 255 }, { 255, 111, 108, 255 },
                { 255, 111, 108, 255 }, { 255, 110, 107, 255 }, { 255, 110, 107, 255 }, { 255, 109, 105, 255 }, { 255, 109, 105, 255 }, { 255, 108, 104, 255 },
                { 255, 107, 104, 255 }, { 255, 107, 102, 255 }, { 255, 106, 102, 255 }, { 255, 106, 101, 255 }, { 255, 105, 101, 255 }, { 255, 104, 99, 255 },
                { 255, 104, 99, 255 }, { 255, 103, 98, 255 }, { 255, 103, 98, 255 }, { 255, 102, 97, 255 }, { 255, 102, 96, 255 }, { 255, 101, 96, 255 }, { 255, 101, 96, 255 },
                { 255, 100, 94, 255 }, { 255, 100, 94, 255 }, { 255, 99, 93, 255 }, { 255, 99, 92, 255 }, { 255, 98, 91, 255 }, { 255, 98, 91, 255 }, { 255, 97, 90, 255 },
                { 255, 97, 89, 255 }, { 255, 96, 89, 255 }, { 255, 96, 89, 255 }, { 255, 95, 88, 255 }, { 255, 95, 88, 255 }, { 255, 94, 86, 255 }, { 255, 93, 86, 255 },
                { 255, 93, 85, 255 }, { 255, 93, 85, 255 }, { 255, 92, 85, 255 }, { 255, 92, 84, 255 }, { 255, 91, 83, 255 }, { 255, 91, 83, 255 }, { 255, 90, 82, 255 },
                { 255, 90, 82, 255 }, { 255, 89, 81, 255 }, { 255, 89, 82, 255 }, { 255, 89, 80, 255 }, { 255, 89, 80, 255 }, { 255, 89, 79, 255 }, { 255, 89, 79, 255 },
                { 255, 88, 79, 255 }, { 255, 88, 79, 255 }, { 255, 87, 78, 255 }, { 255, 87, 78, 255 }, { 255, 87, 78, 255 }, { 255, 87, 77, 255 }, { 255, 87, 77, 255 },
                { 255, 86, 77, 255 }, { 255, 86, 77, 255 }, { 255, 85, 76, 255 }, { 255, 85, 76, 255 }, { 255, 85, 75, 255 }, { 255, 85, 76, 255 }, { 255, 85, 75, 255 },
                { 255, 85, 76, 255 }, { 255, 84, 75, 255 }, { 255, 84, 75, 255 }, { 255, 84, 75, 255 }, { 255, 84, 75, 255 }, { 255, 85, 75, 255 }, { 255, 84, 75, 255 },
                { 255, 84, 75, 255 }, { 255, 83, 74, 255 }, { 255, 83, 75, 255 }, { 255, 83, 75, 255 }, { 255, 84, 75, 255 }, { 255, 83, 75, 255 }, { 255, 83, 75, 255 },
                { 255, 83, 75, 255 }, { 255, 83, 75, 255 }, { 255, 83, 76, 255 }, { 255, 83, 76, 255 }, { 255, 83, 76, 255 }, { 255, 83, 76, 255 }, { 255, 83, 76, 255 },
                { 255, 83, 76, 255 }, { 255, 83, 76, 255 }, { 255, 83, 76, 255 }, { 255, 83, 77, 255 }, { 255, 84, 78, 255 }, { 255, 83, 78, 255 }, { 255, 84, 79, 255 },
                { 255, 84, 78, 255 }, { 255, 84, 79, 255 }, { 255, 83, 79, 255 }, { 255, 84, 80, 255 }, { 255, 83, 80, 255 }, { 255, 84, 81, 255 }, { 255, 85, 82, 255 },
                { 255, 85, 82, 255 }, { 255, 85, 83, 255 }, { 255, 85, 83, 255 }, { 255, 85, 84, 255 }, { 255, 85, 84, 255 }, { 255, 86, 85, 255 }, { 255, 86, 85, 255 },
                { 255, 87, 87, 255 }, { 254, 89, 89, 255 }, { 254, 91, 92, 255 }, { 253, 92, 93, 255 }, { 252, 94, 96, 255 }, { 251, 96, 98, 255 }, { 251, 97, 100, 255 },
                { 249, 99, 103, 255 }, { 249, 100, 105, 255 }, { 248, 102, 108, 255 }, { 247, 104, 111, 255 }, { 246, 105, 113, 255 }, { 245, 107, 116, 255 },
                { 244, 109, 119, 255 }, { 243, 110, 122, 255 }, { 242, 112, 125, 255 }, { 241, 113, 127, 255 }, { 240, 115, 130, 255 }, { 239, 117, 134, 255 },
                { 238, 118, 136, 255 }, { 237, 120, 140, 255 }, { 236, 121, 142, 255 }, { 235, 123, 145, 255 }, { 234, 124, 148, 255 }, { 233, 126, 151, 255 },
                { 232, 127, 154, 255 }, { 232, 129, 157, 255 }, { 230, 130, 159, 255 }, { 230, 132, 162, 255 }, { 229, 133, 165, 255 }, { 228, 135, 168, 255 },
                { 227, 136, 170, 255 }, { 227, 138, 173, 255 }, { 226, 139, 176, 255 }, { 225, 140, 178, 255 }, { 224, 142, 181, 255 }, { 223, 143, 183, 255 },
                { 223, 144, 185, 255 }, { 223, 146, 188, 255 }, { 222, 147, 190, 255 }, { 221, 148, 192, 255 }, { 221, 150, 195, 255 }, { 220, 151, 197, 255 },
                { 219, 152, 199, 255 }, { 219, 153, 201, 255 }, { 219, 154, 202, 255 }, { 219, 156, 205, 255 }, { 218, 157, 207, 255 }, { 217, 158, 208, 255 },
                { 217, 159, 210, 255 }, { 217, 160, 211, 255 }, { 217, 161, 213, 255 }, { 216, 162, 214, 255 }, { 216, 163, 216, 255 }, { 216, 164, 217, 255 },
                { 215, 165, 218, 255 }, { 216, 166, 219, 255 }, { 215, 166, 220, 255 }, { 215, 167, 222, 255 }, { 215, 168, 223, 255 }, { 215, 169, 223, 255 },
                { 215, 170, 224, 255 }, { 215, 170, 225, 255 } };

        ColorScheme colorScheme = new ColorScheme();
        for (int c = 0; c < 256; ++c)
            colorScheme.set(c, new Color(sum[c][0], sum[c][1], sum[c][2], 255 - c));
        return colorScheme;
    }

}
