package Strings;

public class StringRotation {

    public static void main(String args[]) {
        String test = "gaurav";
        String rotated = "vgaura";
        boolean isRotated = isRotatedVersion(test, rotated);
        System.out.printf("Is '%s' is rotation of '%s' : %b %n", rotated, test, isRotated);
    }


    public static boolean isRotatedVersion(String original, String rotated) {
        boolean isRotated = false;
        if (original == null || rotated == null)
            return false;
        else if (original.length() != rotated.length())
            isRotated = false;
        else {
            String concatenated = original + original;
            isRotated = concatenated.contains(rotated);
        }
        return isRotated;
    }

    public static boolean isRotated(String original, String rotated) {
        if (original == null || rotated == null) {
            return false;
        } else if (original.length() != rotated.length()) {
            return false;
        }
        int index = rotated.indexOf(original.charAt(0));
        if (index > -1) {
            if (original.equalsIgnoreCase(rotated)) {
                return true;
            }
            int finalPos = rotated.length() - index;
            return rotated.charAt(0) == original.charAt(finalPos) && original.substring(finalPos).equals(rotated.substring(0, index));
        }
        return false;
    }


}
