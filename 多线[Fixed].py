def liebiao(x):#将字符串x转化为列表。比如说将'114 514'转化成[114,514]
    z=[]
    y=''
    for i in range(len(x)):
        if x[i] != ' ':
            y+=x[i]
        else:
            z.append(float(y))
            y=''
    z.append(float(y))
    return z

def chuli(x):#将度数处理，就是说将时间段转化为时间点，就是说球碰到砖的时间点
    z=[0]
    y=0
    for i in range(len(x)):
        y+=x[i]
        z.append(y)
    return z

def paixu(x):#排序。我也不知道叫啥排序，要是我取名我就取人类排序。因为人类就是这么排序的。
    z=[]
    w=x
    y=0
    for i in range(len(x)):
        y=w[0]
        for j in w:
            if y>j:
                y=j
        w.remove(y)
        z.append(y)
    return z

def nichuli(x):#逆处理，将时间点转化为时间段，也就是要放进adofai里的轨道度数
    z=[]
    for i in range(1,len(x)):
        z.append(x[i]-x[i-1])
    return z

n=int(input('输入你要让几线轨道混合'))
m=[]
for i in range(n):
    a=str(input('输入每个线的轨道的所有度数中间用空格隔开。结尾不能有空格。这是第'+str(i+1)+'线'))
    m+=chuli(liebiao(a))

m=nichuli(paixu(m))

#注释。

sy=float(input('双押多少度（度数必须大于等于0.0001）'))
p=[]#最后的处理，接下来要把小于0.0001的角度都替换成sy。有时候浮点计算会出现非常接近0的数导致没法放进游戏里。
q=0
for i in m:
    if i < 0.0001:
        q+=sy-i
        p.append(sy)
    else:
        p.append(i-q)
        q=0

for i in p:
    print(i,end=' ')