func twoSum(nums []int, target int) []int {
    m := make(map[int]int)

    for i := 0; i < len(nums); i++ {
        if index1, ok := m[target - nums[i]]; ok {
            return []int {index1, i}
        } else {
            m[nums[i]] = i
        }
    }

    return nil
}