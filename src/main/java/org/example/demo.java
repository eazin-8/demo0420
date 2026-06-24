package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class demo {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] all = new int[len1 + len2];

        // 2. 把 nums1 拷贝进去
        System.arraycopy(nums1, 0, all, 0, len1);
        // 3. 把 nums2 拷贝进去
        System.arraycopy(nums2, 0, all, len1, len2);

        // 4. 给 int 数组排序（Arrays.sort）
        java.util.Arrays.sort(all);

        int n = all.length;
        // 5. 计算中位数
        if (n % 2 == 1) {
            return all[n / 2];
        } else {
            int left = all[n / 2 - 1];
            int right = all[n / 2];
            return (left + right) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2,5};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
