	Danh sách bài tập thực hành 
Thuật toán trong An toàn thông tin 2021

Bài 1. Biểu diễn số A thành một ma trận (sẽ giới hạn kích thước số A không quá lớn)
Ví dụ: 
P=2147483647; W=8; Số nguyên a=38762497
KQ: A= [2    79   120     1]
P=2147483647; W=8; Số nguyên a=568424364
KQ: A= [33   225   119   172]

Bài 2. Cài đặt chương trình tính tổng của hai số lớn trong hai trường hợp:
Mỗi số đã được cho dưới dạng một mảng biểu diễn. 
Mỗi số chưa được biểu diễn thành mảng
Ví dụ: 
P=2147483647; W=8; a=38762497; b= 568424364
A= [2    79   120     1]
B= [33   225   119   172]
P=2147483647; W=8
KQ A+B =(0, [36    48   239   173])

Bài 3. Cài đặt chương trình tính hiệu của hai số lớn trong hai trường hợp:
- Mỗi số đã được cho dưới dạng một mảng biểu diễn
- Mỗi số chưa được biểu diễn thành mảng

Ví dụ:
 P=2147483647; W=8; a=38762497; b= 568424364
A= [2    79   120     1]
B= [33   225   119   172]
KQ: c=a-b=(1, [224   110     0    85])

Bài 4. Cài đặt chương trình phép cộng trên Fp
Ví dụ: P=2147483647; W=8; a=2147483646; b= 2147483643
A=[127   255   255   254]
B=[127   255   255   251]
KQ: [127   255   255   249]

Bài 5. Cài đặt chương trình tính phép trừ trên Fp
Ví dụ: p=2147483647; W=8; a=38762497; b= 568424364
KQ:[ 96   110     0    84]

Bài 6. Cài đặt chương trình tính phép nhân
Ví dụ: p=2147483647; W=8; a=524647; b= 32549
A=[0	 8	1     103]
B=[0	0	127	37]
c=a.b=[0	0	0	3	249	218	76	227]

Bài 7. Cài đặt chương trình  tính ước chung lớn nhất của 2 số a và b
Ví dụ: 	a= 28150488 b= 10507620 =>gcd(a,b)=12
a= b=	345632 => gcd(a,b)=1

Bài 8. Cài đặt chương trình tính nghịch đảo trên Fp dùng Euclide mở rộng
Ví dụ: p= 489573857; a= 45682375  => a^-1 mod p = 242160691

Bài 9. Viết chương trình tìm tất cả các số nguyên tố <=n với n nhập vào từ bàn phím 
Ví dụ: n=30  [2,3,5,7,11,13,17,19,23,29]

Bài 10. Viết chương trình tìm một thừa số không tầm thường của một số n nhập từ bàn phím:
Ví dụ: n=43567127  KQ: d=7181

Bài 11. Viết chương trình tìm phân tích nguyên tố của một số nhập vào từ bàn phím:
Ví dụ: 	n=20  coso=[2,5], somu=[2,1]
n=12   coso=[2,3], somu=[2,1]

Bài 12. Viết chương trình kiểm tra tính nguyên tố của một số n nhập vào từ bàn phím
Ví dụ: 	17  Nguyên tố
19  Nguyên tố
21  Hợp số

Bài 13. Viết chương trình kểm tra một số n nhập từbàn phím có phải là một số camichael hay không?
Ví dụ: 	n=561  số camichael
		N=22  Không phải camichael
		
Bài 14. Viết chương trình liệt kê tất cả các số camichael nhỏ hơn hoặc bằng n nhập từ bàn phím

Bài 15. Viết chương trình kiểm tra số nguyên tố với xác suất nằm trong khoảng cho trước.

Bài 16. Cài đặt thuật toán tìm kiếm mẫu P trong đoạn văn bản T kết quả trả về vị trí xuất hiện của mẫu P và số lần lặp tính toán, số phép tính theo Boyer Moore với P và T nhập vào từ bàn phím

Bài 17. Cài đặt thuật toán tìm kiếm mẫu P trong đoạn văn bản T kết quả trả về vị trí xuất hiện của mẫu P và số lần lặp tính toán, số phép tính theo Knuth-Moris-Pratt với P và T nhập vào từ bàn phím

Bài 18. Cài đặt thuật toán tìm kiếm mẫu P trong đoạn văn bản T kết quả trả về vị trí xuất hiện của mẫu P và số lần lặp tính toán, số phép tính theo thuật toán vét cạn Với P và T nhập vào từ bàn phím

Bài 19. Tìm đa thức nghịch đảo của a(x) trên trường hữu hạn GF(2n) với đa thức bất khả quy g(x) bậc n. (a-1(x) là nghịch đảo của a(x) nếu thỏa mãn: a-1(x). a(x) mod g(x) = 1)

Input: a(x), g(x) (thỏa mãn gcd(a(x), g(x)) = 1)

Output: a-1(x) thỏa mãn a-1(x).a(x) mod g(x) = 1

Ví dụ: GF(23) với g(x) = x3 + x + 1

Phép cộng = phép XOR = mod 2

a(x) = x2 + 1; b(x) = x2 + x + 1 => a(x) + b(x) = x + 1

Phép nhân: nhân thông thường sau đó KQ rút gọn cho đa thức g(x)

a(x) = x2 + 1; b(x) = x2 + x + 1 

=> a(x). b(x) = x4 + x3 + x2 + x2 + x + 1 

                      = x4 + x3 + x + 1 mod (x3 + x + 1)
		      
                      = x2 + x
		      
Đa thức nghịch đảo: (x2 + x) là nghịch đảo của (x+1) vì 

(x2 + x). (x+1) mod g(x) = 1

Thuật toán tìm nghịch đảo của đa thức theo một đa thức nguyên tố cùng nhau với nó, được trình bày tương tự như Euclide mở rộng!

VD: Test thử với các a(x) trên GF(23) trong đó g(x) = x3 + x + 1

Với a(x) = x2 + x + 1 => a-1(x) = x

Với a(x) = x + 1 => a-1(x) = x2 + x
….

