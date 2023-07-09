import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class distinct {
    public List<List<Integer>> findDisappearedNumbers(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> missingInNums1 = new ArrayList<>();
        List<Integer> missingInNums2 = new ArrayList<>();

        for (int num : nums1) {
            if (!set2.contains(num)) {
                missingInNums2.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num)) {
                missingInNums1.add(num);
            }
        }

        answer.add(missingInNums1);
        answer.add(missingInNums2);

        return answer;
    }
}

