#중간 실기 문제 1

#"shingu","it","software" ,3개의 항목을 가지는 list변수 std_id 생성
std_id = ["shingu","it","software"]
# 사용자에게 id입력받음
user_id = str(input("id를 입력해주세요 :"))
# 입력받은 id가 std_id 중에 있으면 "환영합니다." 없으면 "없는 id입니다." 출력
if std_id[0] == user_id or std_id[1] == user_id or std_id[2] == user_id :
    print("환영합니다.")
else :
    print("없는 id입니다.")



#중간 실기 문제 2
#사용자에게 "입력받을 학생 수 :"라고 메시지를 띄우고 학생수를 입력받음
std_num = int(input("입력 받을 학생 수 :"))
name = []
grade = []
total = []
for i in range(std_num) :
    name.append(str(input("영문 이니셜을 입력해 주세요.")))
    grade.append(int(input("학년을 숫자만 입력해 주세요. (1~3)")))
    total.append(int(input("총점을 입력해 주세요.(0~100)")))

for i in range(std_num):
    num += 0
    sum = total[num] + sum


#중간 실기 문제 3
import turtle as t
t.shape("turtle")
import random

do = random.choice([0,3,4,5]) # 랜덤으로 원(0각형),삼각형,사각형,오각형
r = random.randint(10,101)    # 랜덤으로 한변의 길이 or 반지름
color = random.choice(["red","yellow","green","blue","purple"]) #랜덤으로 색상지정
x_address = random.randint(-200,201) # -200에서 200까지 랜덤으로 x,y 좌표
y_address = random.randint(-200,201)

t.up()
t.goto(x_address,y_address) #랜덤하게 받은 x,y좌표로 이동
t.down()
t.fillcolor(color) #랜덤하게 받은 색상으로 지정
t.begin_fill() 

#만약 원이면 반지름이 r인 원 그리기
if do == 0 :
    t.circle(r)
else :   #만약 원이 아니면 3,4,5 각형중 랜덤으로 지정된 도형 그리기
    for i in range(do):
        t.fd(r)
        t.lt(360/do)
        
t.end_fill()
t.done() 
    


