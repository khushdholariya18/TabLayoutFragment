package com.example.tablayoutfrag.Adpter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayoutfrag.Fragments.CallsFragment;
import com.example.tablayoutfrag.Fragments.ChatsFragment;
import com.example.tablayoutfrag.Fragments.StatuesFragment;

public class viewPagerAdpter extends FragmentPagerAdapter {

    public viewPagerAdpter(@NonNull FragmentManager fm) {
        super(fm);
    }
//    ?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

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new StatuesFragment();
        }else if (position == 1){
            return new ChatsFragment();
        }else {
            return new CallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return  "Status";
        }else if (position == 1){
            return "Chats";
        }else {
            return "Calls";
        }
    }
}
