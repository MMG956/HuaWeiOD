package leetcode.hot100;

import cn.adalab.leetcode.helpers.SolutionRunner;

public class P4寻找两个正序数组的中位数 extends SolutionRunner {
    @Override
    public void run(){
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //1、首先把两个数组长度相加得出总长度
        int length = nums1.length + nums2.length;

        //2. 奇数偶数做区分
        //  如果是奇数，中位数就是index就是 length / 2 的那个数
        //  如果是偶数，中位数就是序号为 length / 2 的那个数和 length - 1 那个数之和除以 2

        int index1 = 0;
        int index2 = 0;

        if (length % 2 == 0){

        }else {

        }

        //3.采取双指针， 一个数组一个指针，从零开始，谁小谁往右移，直到达到 中位数所在的 数字。

        return 2.10;
    }




}
