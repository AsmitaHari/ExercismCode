public class Twofer {
    public String twofer(String name) {
        String message = new String("One for %s, one for me.");
        if (name == null) {
            return String.format(message,"you");
        } else {
            return String.format(message, name);
        }
    }
}
