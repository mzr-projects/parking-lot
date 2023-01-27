package org.example.entities.account;

import org.example.entities.people.Person;

abstract class Account {

    protected String userName;

    protected String password;

    protected AccountStatus accountStatus;

    protected Person person;

    protected abstract boolean resetPassword();
}
