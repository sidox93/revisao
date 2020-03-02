package br.com.fiap.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun salvar(view : View){

        var numeroInformado = edtAlgumaCoisa.text.toString().toDouble()

        val radioSelecionado = when (rgdOpcoes.checkedRadioButtonId){
            R.id.rdbOpcao01 -> getString(R.string.opcao_01)
            R.id.rdbOpcao02 -> getString(R.string.opcao_02)
            R.id.rdbOpcao03 -> getString(R.string.opcao_03)
            else            -> getString(R.string.nenhuma_opcao)
        }
        if (chkSelecioneMe.isChecked){
            numeroInformado = numeroInformado * 1.5
        }

        val msg = "A opção selecionada é ${radioSelecionado} e o valor fianl é: ${numeroInformado}"

        txtResultado.setText(msg)

        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
    }
}
