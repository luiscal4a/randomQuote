package com.example.randomquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] citas = {
            "Al final, lo que importa no son los años de vida, sino la vida de los años..",
            "Amar no es solamente querer, es sobre todo comprender.",
            "Si no actúas como piensas, vas a terminar pensando como actúas.",
            "La Duda es uno de los nombres de la Inteligencia.",
            "Un amigo de todos es una amigo de nadie.",
            "El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito.",
            "Cuando no se piensa lo que se dice es cuando se dice lo que se piensa.",
            "La vida es como una bicicleta. Para mantener el equilibrio tienes que seguir adelante.",
            "Reflexiona con lentitud, pero ejecuta rápidamente tus decisiones.",
            "Pensar es más interesante que saber, pero menos interesante que mirar.",
            "Cuando cambias el modo en que ves las cosas, las cosas que ves cambian también.",
            "Nuestra recompensa se encuentra en el esfuerzo y no en el resultado. Un esfuerzo total es una victoria completa.",
            "El ignorante afirma, el sabio duda y reflexiona.",
            "No encuentres la falta, encuentra el remedio.",
            "Un hombre que no se alimenta de sus sueños envejece pronto.",
            "La felicidad no es la ausencia de problemas, es la habilitad para tratar con ellos.",
            "La realidad no es lo que nos sucede, sino lo que hacemos con lo que nos sucede.",
            "No malgastes tu tiempo, pues de esa materia está formada la vida.",
        };

        final TextView cita = (TextView) findViewById(R.id.cita);
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = new Random().nextInt(citas.length);
                cita.setText(citas[index]);
            }
        });

    }
}
