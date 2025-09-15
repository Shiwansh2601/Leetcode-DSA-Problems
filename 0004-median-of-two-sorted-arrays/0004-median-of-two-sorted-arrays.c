double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int i=0,j=0,k=-1;
    int marr[nums1Size+nums2Size];

    int indx;
    while(i< nums1Size&& j< nums2Size)
    {
        if(nums1[i]<nums2[j])
        {    k++;
            marr[k]=nums1[i];
            i++;
        
        }
        else 
        {   k++;
            marr[k]=nums2[j];
            j++;
        
        }
    }
    while(i<nums1Size)
    {    k++;
        marr[k]=nums1[i];
        i++;
    
    }
     while(j<nums2Size)
    {   k++;
        marr[k]=nums2[j];
        j++;
        
    }
    indx=k/2;
    if(k%2==1)
    {   
       
    return (marr[indx]+marr[indx+1])/2.0;
    
    }
    else
    {
       return marr[indx];
    
    }

}