package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q0001_TwoSum {
    public static void main(String[] args) {

    }

    // brute force : O(N^2)
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    // HashMap : O(n)
    public int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length-1; i++) {
            int sub = target - nums[i];
            if(map.containsKey(sub) && map.get(sub) != i){
                return new int[]{i, map.get(sub)};
            }
        }

        return null;
    }

    //HashMap : O(n)
    public int[] twoSum3(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int sub = target - nums[i];
            if ( !map.containsKey(nums[i]) ){
                map.put(sub,i);
            }else{
                int [] ans = {map.get(nums[i]),i};
                return ans;
            }
        }

        return null;
    }
}
