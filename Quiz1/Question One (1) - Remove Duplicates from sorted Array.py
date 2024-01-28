nums =[1,1,2,2,3,3,4,4,5,5,6,7,8,9,10,10,11,11,11,23,45,45]
# 2 pointers - one for the original address and the next to detect and remove duplicates , once the second pointer
#  reaches a number greater than that  of the first pointer ,the address of the first pointer changes to the bigger number and the second pointer moves to the next address
print("Before removing duplicates: "+str(nums))
pointer1 = 0
pointer2 = pointer1 + 1

while(pointer1 < pointer2 and pointer2 <= len(nums)-1):
    if(nums[pointer1] == nums[pointer2]):
        nums.__delitem__(pointer2)
    elif(nums[pointer1]<nums[pointer2]):
        pointer1+=1
        pointer2+=1
    else:
        pointer2+=1
print("After removing duplicates:"+str(nums))
#   OUTPUT : Before removing duplicates :[1,1,2,2,3,3,4,4,5,5,6,7,8,9,10,10,11,11,11,11,23,45,45]
#             Afrer removing duplicates nums [20]={1,2,3,4,5,6,7,8,9,10,23,45]