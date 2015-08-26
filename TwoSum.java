// Version 0

public int[] twoSum(int[] nums, int target) {
		int[] index = { -1, -1 };
		Integer[] nums2 = new Integer[nums.length];
		int n = 0;
		for (int value : nums) {
			nums2[n++] = Integer.valueOf(value);
		}

		for (int i = 0; i < nums2.length - 1; i++) {

			int t = target - nums2[i];
			int j = Arrays.asList(nums2).lastIndexOf(t);
			if (j >= 0 && j != i) {
				index[0] = i + 1;
				index[1] = j + 1;
			}
		}

		Arrays.sort(index);
		return index;
	}

// Version 1

	public int[] twoSum(int[] nums, int target) {
		int[] index = { -1, -1 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					index[0] = i + 1;
					index[1] = j + 1;
				}
			}
		}
		Arrays.sort(index);
		return index;
	}