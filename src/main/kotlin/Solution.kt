import java.util.*

/**
 * 하노이 탑
 * 1. 한번에 하나의 원반만 이동이 가능
 * 2. 큰원판이 작은 원판에 있어선 안됨
 *
 *  탑의 세게의 기둥 (처음,보조,끝)
 * n = 1
 *
 * [1,3]
 *
 * n = 2
 *
 * [1,2] [1,3] [2,3]
 *
 * n = 3
 *
 * [1,3] [1,2] [3,2]
 * [1,3]
 * [2,1] [2,3] [1,3]
 *
 * n = 4
 * [1,2] [1,3] [2,3]
 * [1,2]
 * [3,1] [3,2] [1,2]
 * [1,3]
 * [2,3] [2,1] [3,1]
 * [2,3]
 * [1,2] [1,3] [2,3]
 *
 * 찾은 규칙
 * n 이 홀수일때는 가장 작은걸 마지막 탑으로
 * n 이 짝수일때는 가장 작은걸 서브 탑으로
 */


class Solution {
    val towerFirst = Stack<Int>()
    val towerSub = Stack<Int>()
    val towerLast = Stack<Int>()

    fun ringInTower(size:Int):IntArray{
        var answer = intArrayOf(0,0)

        return answer
    }
    fun solution(n: Int): Array<IntArray> {
        var answer = mutableListOf<IntArray>()

        //초기화
        for (ring in n downTo 1) towerLast.push(ring)

        //로직

        while (towerLast.size == n) { //마지막으로 다 채워질때까지
            //
//            answer.add(ringInTower())
        }
        return answer.toTypedArray()
    }
}

fun main() {
    val a = Solution()
    a.solution(2) //[1,2],[1,3],[2,3]
}