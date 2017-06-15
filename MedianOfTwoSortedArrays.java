package arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int nums1[] = {1,2};
		int nums2[] = {3,4};
		MedianOfTwoSortedArrays m=new MedianOfTwoSortedArrays();
		System.out.println(m.findMedianSortedArrays(nums1, nums2));
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int start1 , start2;
        int size=nums1.length+nums2.length;
        int nums3[] = new int[size];
		
        start1 = start2 = 0;
        int k;
		for(k=0;k<size;k++)
		{
			if(start1 < nums1.length && start2 < nums2.length){
				if(nums1[start1] < nums2[start2]){
					nums3[k] = nums1[start1];
					start1++;
				}
				else {
					nums3[k] = nums2[start2];
					start2++;
				}
			}
			else
				break;
		}
		if(start1==nums1.length){
			while(start2<nums2.length){
				nums3[k++] = nums2[start2];
				start2++;
			}
		}
		if(start2==nums2.length){
			while(start1<nums1.length){
				nums3[k++] = nums1[start1];
				start1++;
			}
		}   
		int index1,index2;
		double retVal=0.0;
		if(size % 2 == 0){
			index1=(size/2)-1;
			index2=size/2;
			retVal = (nums3[index1] + nums3[index2]) / 2.0;
		}
		else 
			retVal = nums3[size/2];
		
        return retVal;
        
        
    }
}
