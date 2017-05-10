package com.example.sangameswaran.nccarmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sangameswaran on 10-05-2017.
 */

public class GrantRevokePermissionFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.grant_revoke_permission_fragment,container,false);
        //initialize views


        return v;

    }
}
