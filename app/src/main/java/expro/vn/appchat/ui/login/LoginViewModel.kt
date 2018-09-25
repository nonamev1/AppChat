package expro.vn.appchat.ui.login

import android.arch.lifecycle.ViewModel
import expro.vn.appchat.api.ChatService
import javax.inject.Inject

class LoginViewModel @Inject constructor(private  val chatService: ChatService) : ViewModel(){
    fun test(){
        chatService.requestLogin()
    }
}