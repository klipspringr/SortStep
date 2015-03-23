import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    //your code here
    for (int outer = 0; outer < list.length - 1; outer++) // how many times the code moves through the array
    {
      for (int inner = 0; inner < list.length-outer-1; inner++) // how many pairs the code will go through
      {
        if (list[inner] > list[inner + 1])
        {
        //swap list[inner] & list[inner+1]
        int temp = list[inner];
        list[inner] = list[inner + 1];
        list[inner + 1] = temp;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    //your code here
    int flag, temp;
    for (int outer = 0; outer < list.length - 1; outer++)
    {
      flag = outer;  
      for (int inner = outer + 1; inner < list.length; inner ++)
      {
        if (list[inner] < list[flag])
        {
          flag = inner;
        }
      }
    //swap list[outer] & list[flag]
     temp = list[outer];

     list[outer] = list[flag];

      list[flag] = temp;
    }
  }

  public void insertionSort(int[] list)
  {
    //your code here
    for (int outer = 1; outer < list.length; outer++) 
    {
      int position = outer;
      int key = list[position];
    // Shift larger values to the right
      while (position > 0 && list[position - 1] > key)
      {
        list[position] = list[position - 1];
        position--;
      }
      list[position] = key;
    }
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    int c[] = new int[(a.length)];
    int nA = first;
    int nB = mid+1;
    for (int i = first; i <= (last); i++)
    {
      if (nA > mid)
      {
        c[i] = a[nB];
        nB++;
      }
      else if (nB > last)
      {
        c[i] = a[nA];
        nA ++;
      }
      else if (a[nA] > a[nB])
      {
        c[i] = a[nB];
        nB++;
      }
      else
      {
        c[i] = a[nA];
        nA ++;
      }
    }
   // return c;
  }

  public void mergeSort(int[] a, int first, int last)
  {
    //your code here
    //declare and initialize
    int mid = (first + last)/2;
     //local variable mid

     if(first != last) //more than one element

     {

        mergeSort(a, first, mid); //fist half

        mergeSort(a, mid+1, last); //second half

     } 

     merge(a, first, mid , last);

  }
}

