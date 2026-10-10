public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {
        if (filename == null) {
            return "Rejected - invalid file type";
        }

        // Find the last occurrence of '.' in the filename
        int lastDotIndex = filename.lastIndexOf('.');

        // If no '.' exists or it's the last character, reject
        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            return "Rejected - invalid file type";
        }

        // Extract the extension using substring()
        String extension = filename.substring(lastDotIndex + 1);

        // Compare case-insensitively using equalsIgnoreCase()
        if (extension.equalsIgnoreCase("pdf") || 
            extension.equalsIgnoreCase("docx") || 
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected - invalid file type";
        }
    }

    public static void main(String[] args) {
        // Sample Tests
        System.out.println(validateFileExtension("Assignment1.PDF")); // Output: Accepted
        System.out.println(validateFileExtension("notes.txt"));       // Output: Rejected - invalid file type
    }
}