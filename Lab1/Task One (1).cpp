#include <iostream>

int summation(int arr[], int n) {
  int sum = 0;
  for (int i = 0; i < n; i++) {
    sum += arr[i];
  }
  return sum;
}

int maximum(int arr[], int n) {
  int max = arr[0];
  for (int i = 1; i < n; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

int main() {

  int n;
  std::cout << "Enter size of array: ";
  std::cin >> n;

  int arr[n];
  for (int i = 0; i < n; i++) {
    std::cout << "Enter element " << i << ": ";
    std::cin >> arr[i];
  }

  int sum = summation(arr, n);
  std::cout << "Summation: " << sum << "\n";

  int max = maximum(arr, n);
  std::cout << "Maximum: " << max;

  return 0;
}
