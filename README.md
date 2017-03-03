# fileio

By Narut Poovorakit

NUMBER | TASK                                                   | TIME
-------|--------------------------------------------------------|-------------------------:
   1   | Copy the file one byte at a time                       | 0.113211082
   2   | Copy the file using a byte array of size 1KB(1024)     | 0.025320954
   3   | Copy the file using a byte array of size 4KB(4096)     | 0.014101884
   4   | Copy the file using a byte array of size 64KB(65536)   | 0.013282072
   5   | Copy the file using BufferedReader and PrintWriter     | 0.023282328

In the following table above show that the 4th task has the slowest run time because using array is the fastest than
just copy byte to byte or use the BufferedReader to convert the bytes to char to String. The size also affect the runtime by
the more capacity of an array, the less run time you get.
