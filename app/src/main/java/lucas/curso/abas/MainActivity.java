package lucas.curso.abas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import lucas.curso.abas.Fragment.EmAltaFragment;
import lucas.curso.abas.Fragment.InicioFragment;
import lucas.curso.abas.Fragment.InscricoesFragment;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout stl;
    private ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stl = findViewById(R.id.viewPagerTab);
        vp = findViewById(R.id.viewPager);

        getSupportActionBar().setElevation(0);

        //configurar adapter para abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Inicio", InicioFragment.class)
                        .add("Incrições", InscricoesFragment.class)
                        .add("Em Alta", EmAltaFragment.class)
                        .create());

        vp.setAdapter(adapter);
        stl.setViewPager(vp);
    }
}