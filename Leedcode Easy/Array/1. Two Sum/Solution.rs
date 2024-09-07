fn impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut sum_array = Vec::new();
        for i in 0..nums.len(){
            for j in i..nums.len(){
                if i != j && nums[i] + nums[j] == target {
                    sum_array.push(i as i32);
                    sum_array.push(j as i32);
                    return sum_array.to_vec();
                }
            }
        }
        Vec::new()
    }
    

    pub fn main() {
        let result = two_sum([2,4,6,10,14], 20);
        println!("Sum: {}", result);
    }
}