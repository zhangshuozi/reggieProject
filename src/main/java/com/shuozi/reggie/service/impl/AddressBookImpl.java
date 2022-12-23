package com.shuozi.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuozi.reggie.entity.AddressBook;
import com.shuozi.reggie.mapper.AddressBookMapper;
import com.shuozi.reggie.service.AddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressBookImpl extends ServiceImpl<AddressBookMapper,AddressBook> implements AddressBookService {
}
