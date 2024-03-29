package com.example.cartoon.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cartoon.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        main_list = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        main_list.add(new Model(R.drawable.spongebob,"SpongeBob SquarePants","Bikini Bottom, 14 Juli 1986","Koki di Krusty Krab","SpongeBob SquarePants, tokoh utama dalam kartun ini yang adalah seekor spons yang sebenarnya berbentuk spons mandi berwarna kuning ini adalah pribadi yang baik, mudah diajak berteman, dan optimistis. Spongebob tinggal di dalam rumah berbentuk nanas di laut, di Jalan Conch nomor 124, Bikini Bottom. Dia juga memelihara seekor siput yang bernama Gary. Pekerjaannya sehari- hari adalah koki di rumah makan Krusty Krab (dia sendiri pun mendapat penghargaan \"Employee of the Month\" (Pegawai Teladan Bulan Ini) 374 kali berturut - turut), yang terkenal dengan burgernya Krabby Patty. Dia juga bersekolah di Mrs. Puff Boating School, sekolah mengemudi Mrs. Puff, namun selalu gagal ketika tes mengemudi. Ia juga suka berburu ubur ubur bersama Patrick."));
        main_list.add(new Model(R.drawable.squiward,"Squidward Quincy Tentacles","9 Oktober 1977","Kasir di Krusty Krab","Squidward Tentacles adalah seekor gurita yang bertetangga dengan SpongeBob dan Patrick, ia kasir yang sering membuat ulah, dan membuat repot semua orang di sekitarnya. Ia tidak senang dengan kedua tetangganya karena dianggap sering mengganggunya. Pekerjaan sehari-hari Squidward adalah menjadi kasir di rumah makan Krusty Krab. Tergolong pemalas, suka bermain klarinet walaupun musik yang dilagukannya jelek. Ia sendiri menganggap dirinya seorang seniman hebat dan orang yang pintar. Memiliki seorang saingan sejak SMA bernama Squilliam Fancyson."));
        main_list.add(new Model(R.drawable.patrick,"Patrick Dempsey Star","26 Februari 1986","Pengangguran","Patrick Star adalah seekor bintang laut berwarna merah muda yang merupakan sahabat Spongebob. Walaupun sering kali tidak berkonsentrasi dalam percakapannya dan terjadi salah pengertian, Patrick adalah sahabat yang baik. Patrick tinggal bersebelahan dengan rumah Squidward yang juga bersebelahan dengan rumah nanas Spongebob dan rumahnya terletak di bawah batu. Patrick merupakan hewan paling bodoh di Bikini Bottom karena dia sering melakukan perbuatan yang konyol dan bodoh.\n" +
                "\n" +
                "Patrick tidak pergi ke sekolah kecuali ke sekolah mengemudi (hanya sekali saja dalam episode New Student Starfish karena menemani SpongeBob). Patrick juga tidak bekerja, segala perbelanjaan untuk kehidupannya di Bikini Bottom selalu diberikan oleh ibu bapaknya (Herb dan Margie) yang menetap jauh dari Bikini Bottom."));
        main_list.add(new Model(R.drawable.krabs,"Eugene Horald Krabs","30 November 1942","Pengusaha (Pemilik dan Pendiri Krusty Krab","Eugene H. Krabs adalah seekor kepiting pemilik restoran Krusty Krab yang terobsesi dengan uang. Karena ia terlalu mencintai uang, ia sampai-sampai tidak rela memberi uang satu sen pun. Mr. Krabs mempunyai pesaing yang bernama Sheldon Plankton, pemilik restoran Chum Bucket yang daganganya tidak pernah laku. Gambaran umum Mr. Krab adalah kepiting yang tamak dan pelit dan Spongebob seringkali menjadi korban ketamakannya. Mr. Krabs memiliki putri bernama Pearl, dan ibu Mr. Krab sudah tua."));
        main_list.add(new Model(R.drawable.sandy,"Sandra Jennifer \"Sandy\" Cheeks","17 November 1987","Ilmuwan, ahli bela diri","Sandy Cheeks (Sandy si Tupai) - adalah seekor tupai atau bajing yang tinggal di dalam laut. Karena Sandy merupakan binatang darat, kesehariannya di Bikini Bottom mengharuskannya memakai baju astronot yang berisi udara pada helmnya sehingga ia bisa bernapas di dalam laut. Sandy menyukai karate, dan senang aksi-aksi berbahaya. Sandy sendiri berasal dari Texas, namun kini bertempat tinggal di Bikini Bottom dan menjadi sahabat Spongebob. Tempat tinggalnya adalah sebuah kubah akuarium kedap air dan berisi udara. Ciri khas rumahnya adalah mempunyai pohon besar sebagai tempat tinggalnya. Spongebob dan Patrick bila berkunjung harus terus menerus memakai mangkuk penuh berisi air yang dipakai terbalik menutupi kepala mereka. Sandy sendiri bekerja sebagai ilmuwan di Treedome Corporation dengan bosnya yang monyet. Di episode Chimps Ahoy, dia hampir meninggalkan Bikini Bottom karena percobaan yang dia buat dianggapnya selalu salah"));
        main_list.add(new Model(R.drawable.plankton,"Sheldon James Plankton","30 November 1942","Pengusaha (Pemilik dan pendiri Chum Bucket","Sheldon J. Plankton - pemilik rumah makan Chum Bucket yang sepi pengunjung. Plankton percaya bahwa bila ia berhasil mencuri resep Kraby Patty maka rumah makannya akan laku keras. Jadi segala daya upaya ia kerahkan untuk mencuri resep dari rumah makan saingannya ini, namun upayanya ini tidak pernah berhasil dan mengakibatkan kesialan untuk dirinya akhirnya di episode 'New Leaf' dia mengganti restorannya dengan toko souvenir. Memiliki istri berwujud sebuah komputer bernama Karen."));
        main_list.add(new Model(R.drawable.gary,"Gary The Snail","1 Mei 1999","Gak Ada","Gary adalah seekor siput peliharaan Spongebob. Berbunyi seperti kucing dan memiliki sifat yang pendiam dan baik. Ia tidak suka mandi dan hanya saat akan dimandikanlah Gary membuat onar."));
        adapter = new CustomAdapter(main_list, getActivity().getApplicationContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}