package com.mnp.designpatterns.factory_pattern

enum class DialogType {
    DIALOG_CREATE_CHAT,
    DIALOG_DELETE_MESSAGE,
    DIALOG_EDIT_MESSAGE
}

sealed class  Dialog {
    object CreatedChatDialog : Dialog()
    object DeleteMessageDialog : Dialog()
    object EditMessageDialog : Dialog()
}

object DialogFactory {
    fun createDialog(type: DialogType): Dialog {
        return when (type) {
            DialogType.DIALOG_CREATE_CHAT -> Dialog.CreatedChatDialog
            DialogType.DIALOG_DELETE_MESSAGE -> Dialog.DeleteMessageDialog
            DialogType.DIALOG_EDIT_MESSAGE -> Dialog.EditMessageDialog
        }
    }
}
