import java.util.Arrays;

//iterative version one, not finished...
public class medianInTwoSortedArray {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /* iteration version divide and conquer with median
		int l1=nums1.length();
        int l2=nums2.length();
        //let nums1 always small equal to nums2
        if(l1>l2)
        {
            int[] numsSwap = nums1;
            nums1 = nums2;
            nums2 = numsSwap;
        }
        if(l1==0&&l2==0) return null;
        if(l1==0&&l2==1) return nums2[0];
        if(l1==1&&l2==1) return (nums1[0]+nums2[0])/2;
        double m1, m2;
        m1=getMedian(nums1);
        m2=getMedian(nums2);
        if(l1==0) return m2;
        if(l2==0) return m1;
        if(l1==1&&l2>=2)
        {
            //in the middle
            if(nums1[0]>=nums2[l/2-1]&&nums1[0]<=nums2[l/2]&&l2%2==0) return nums1[0];
            //left
            else if(nums1[0]<=nums2[l/2-1]&&l2%2==0) return nums2[l/2-1];
            //right
            else if(nums1[0]>=nums2[l/2]&&l2%2==0) return nums2[l/2];
            else if(nums1[0]>=nums2[l/2+1]&&l2%2==1) return (nums2[l/2]+nums2[l/2+1])/2;
            else if(nums1[0]<=nums2[l/2-1]&&l2%2==1) return (nums2[l/2]+nums2[l/2-1])/2;
            else if(nums1[0]>=nums2[l/2-1]&&nums1[0]<=nums2[l/2+1]&&l2%2==1) return (nums2[l/2]+nums1[0])/2;
        }
        if(m1==m2) return m1;
        else{
            //l1,l2 are all odd or even
            if((l1+l2)%2==0)
            {
                                while(nums1.length)

            }
            //
            else
            {
                
            }
            
        }
        
    private double getMedian(int[] num)
    {
        int l = num.length;
        if(l==0) return null;
        
        if(l%2)  return num[l/2];
        else return (num[l/2]+num[l/2-1])/2;
    }
    // l1 is even l2 is even or odd
    private double findMedian(int[] num1 int[] num2)
    {
        while(nums1.length()>2||nums2.length()>2)
        {
            if(getMedian(num1)>getMedian(num2))//condition to divide
            {
                if(nums1.length()>2)//divide 
                {
                    if(nums1.length()%2==0) int[] sub1 = Arrays.copyOfRange(num1,0,num1.length/2);//even
                    else if(nums1.length()%2==1) int[] sub1 = Arrays.copyOfRange(num1,0,num1.length/2+1);//odd
                    num1 = sub1;
                }
                if(nums2.length()>2)
                {
                    //if(nums2.length()%2==0) 
                    int[] sub2 = Arrays.copyOfRange(num2,num2.length/2,num2.length);//even
                    //else if(nums2.length()%2==1) int[] sub2 = Arrays.copyOfRange(num2,num2.length/2,num2.length);//odd
                    num2 = sub2;
                }
            }
            else//median1<median2
            {
                int[] sub = Arrays.copyOfRange(num1,0,num1.length/2);
                num1 = sub;
            }
        }
        
        
    }
    // l1, l2 one is even and another is odd
     * 
     */
		// recusion version of getting Kth element
		 int l1=nums1.length;
         int l2=nums2.length;
         if((l1+l2)%2==1) return findKth(nums1,nums2,(l1+l2)/2+1);
         else return (findKth(nums1,nums2,(l1+l2)/2)+findKth(nums1,nums2,(l1+l2)/2+1))/2.0;
	}

 private double findKth(int[] a, int[] b, int k)
 {
     if(a.length>b.length) return findKth(b,a,k);
     if(a.length==0) return b[k-1];
     if(k==1) return Math.min(a[0],b[0]);
     if(a.length>=k/2&&k%2==0)//for odd k, k/2+k/2 != k so it only works with even k
     {if(a[k/2-1]==b[k/2-1]) return a[k/2-1];}
     int cut = Math.min(a.length,k/2);
     if(a[cut-1]<b[cut-1]) return findKth(Arrays.copyOfRange(a,cut,a.length),b,k-cut);
     else return findKth(a,Arrays.copyOfRange(b,cut,b.length),k-cut);
 
}
}
