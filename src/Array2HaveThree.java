

public class Array2HaveThree {

  /*
  Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
  and no 3's are next to each other.

  haveThree([3, 1, 3, 1, 3]) → true
  haveThree([3, 1, 3, 3]) → false
  haveThree([3, 4, 3, 3, 4]) → false
   */


  public static void main(String[] args) {
    //what is wrong here? Don't seem to find the issue.
//    System.out.println(haveThree([3, 1, 3, 1, 3]));
  }

  public static boolean haveThree(int[] nums) {
    int count = 0;

    if (nums.length < 3) {
      return false;
    }
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 3 && nums[i + 1] == 3) {
        return false;
      } else if (nums[i] == 3) {
        count++;
      }

    }
    if (nums[nums.length - 1] == 3) {
      count++;
    }
    return (count == 3);
  }



}
