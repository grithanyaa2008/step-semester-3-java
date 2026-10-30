public class GymSystem {

    // Problem 1: Batch Sign-up
    public static String signUpBatch(String[] memberIds, int monthlyFee) {
        int signedUp = 0;
        int rejected = 0;
        for (String id : memberIds) {
            try {
                new GymMember(id, monthlyFee);
                signedUp++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }
        return "Signed Up: " + signedUp + " | Rejected: " + rejected;
    }

    // Problem 2: Classify Generation
    public static String classifyGeneration(GymMember member) {
        if (member instanceof EliteMember) {
            return "Multilevel descendant (3 generations deep)";
        } else if (member instanceof GroupClassMember) {
            return "Hierarchical sibling (independent branch)";
        }
        return "Standard or Premium Member";
    }

    // Problem 2: Polymorphic Sum
    public static int getTotalSessionsAttended(GymMember[] members) {
        int total = 0;
        for (GymMember m : members) {
            if (m != null) {
                total += m.getSessionsAttended();
            }
        }
        return total;
    }

    // Problem 4: Batch Print
    public static String batchPrint(GymMember[] members) {
        StringBuilder sb = new StringBuilder();
        for (GymMember member : members) {
            // Polymorphic call
            sb.append(member.displayInfo());
            
            // Guarded downcast for Trainer
            if (member instanceof PremiumMember) {
                PremiumMember pm = (PremiumMember) member;
                sb.append(" [Trainer via downcast: ").append(pm.getTrainerName()).append("]");
            }
            sb.append(" | ");
        }
        return sb.toString();
    }

    // Problem 5: Referral Code Validation (NO REGEX)
    public static boolean isValidReferralCode(String code) {
        if (code == null || code.length() != 4) {
            return false;
        }
        return code.charAt(0) == 'G' &&
               Character.isDigit(code.charAt(1)) &&
               Character.isDigit(code.charAt(2)) &&
               Character.isUpperCase(code.charAt(3));
    }

    // Problem 5: Weekly Check-in with null safety
    public static String processWeeklyCheckIn(GymMember[] members) {
        int processed = 0;
        int nullSkipped = 0;
        int groups = 0;
        int individuals = 0;

        for (GymMember m : members) {
            if (m == null) {
                nullSkipped++;
                continue; // Safely skip nulls
            }
            processed++;
            if (m instanceof GroupClassMember) {
                groups++;
            } else {
                individuals++;
            }
        }
        return processed + " processed | " + nullSkipped + " null skipped | " + groups + " group | " + individuals + " individual";
    }
}