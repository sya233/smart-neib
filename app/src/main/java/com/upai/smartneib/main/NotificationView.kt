package com.upai.smartneib.main

interface NotificationView {

    fun showProgress()

    fun hideProgress()

    fun showToast(msg: String)

    fun updateRecyclerView(list: List<NotificationPresenter.Notification>)

}