package week05.assignment.p1;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessChecker {

    public static String classifyAccess(String fieldModifier, String accessorContext) {
        if (fieldModifier.equals("private")) {
            return accessorContext.equals("SAME_CLASS") ? "ALLOWED" : "DENIED";
        }
        if (fieldModifier.equals("default")) {
            return (accessorContext.equals("SAME_CLASS") || accessorContext.equals("SAME_PACKAGE")) ? "ALLOWED" : "DENIED";
        }
        if (fieldModifier.equals("protected")) {
            if (accessorContext.equals("SAME_CLASS") || accessorContext.equals("SAME_PACKAGE") || 
                accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")) {
                return "ALLOWED";
            }
            return "DENIED";
        }
        if (fieldModifier.equals("public")) return "ALLOWED";
        return "UNKNOWN";
    }

    public static String summarizeByModifier(String[][] attempts) {
        Map<String, int[]> map = new LinkedHashMap<>();
        map.put("private", new int[]{0, 0});
        map.put("default", new int[]{0, 0});
        map.put("protected", new int[]{0, 0});
        map.put("public", new int[]{0, 0});

        for (String[] attempt : attempts) {
            String mod = attempt[0];
            String ctx = attempt[1];
            if (classifyAccess(mod, ctx).equals("ALLOWED")) {
                map.get(mod)[0]++;
            } else {
                map.get(mod)[1]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String mod : map.keySet()) {
            int[] counts = map.get(mod);
            sb.append(mod).append(": ").append(counts[0]).append(" allowed / ").append(counts[1]).append(" denied | ");
        }
        return sb.substring(0, sb.length() - 3);
    }

    public static String firstDeniedAttempt(String[][] attempts) {
        for (int i = 0; i < attempts.length; i++) {
            if (classifyAccess(attempts[i][0], attempts[i][1]).equals("DENIED")) {
                return attempts[i][0] + " via " + attempts[i][1] + " (attempt #" + (i + 1) + ")";
            }
        }
        return "None Denied";
    }
}