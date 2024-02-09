package jp.techacademy.yoshihiro.kunieda.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")

        // 整数型の変数をnumという名前で作成して、10を代入する
        var num =10
        Log.d("kotlintest", Integer.toString(num))

        // numに50を代入する
        // 変数や定数に .toString()と記述する場合もある
        num = 50
        Log.d("kotlintest", num.toString(num))
    }
}