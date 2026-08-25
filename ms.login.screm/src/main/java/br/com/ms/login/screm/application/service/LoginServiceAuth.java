package br.com.ms.login.screm.application.service;

import br.com.ms.login.screm.adapter.out.entity.LoginEntity;

public interface LoginServiceAuth {
    LoginEntity findbyLogin(String loginAuth);
}
