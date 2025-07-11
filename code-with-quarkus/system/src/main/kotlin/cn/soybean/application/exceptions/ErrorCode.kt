package cn.soybean.application.exceptions

enum class ErrorCode(
    val code: Int,
    val message: String,
) {
    AGGREGATE_EVENT_NOT_FOUND(501, "The aggregate event does not exist."),

    TENANT_NOT_FOUND(1001, "The tenant does not exist."),
    TENANT_EXPIRED(1002, "The tenant has expired."),
    TENANT_DISABLED(1003, "The tenant has been disabled."),

    ACCOUNT_NOT_FOUND(1101, "The account does not exist."),
    ACCOUNT_CREDENTIALS_INVALID(1102, "The account credentials are incorrect."),
    ACCOUNT_DISABLED(1103, "The account has been disabled."),
    ACCOUNT_NAME_EXISTS(1104, "The account name is already taken."),
    ACCOUNT_PHONE_NUMBER_EXISTS(1105, "Heads up! That phone number is already in use."),
    ACCOUNT_EMAIL_EXISTS(1106, "Alert! Another account is using this email."),

    SELF_PARENT_MENU_NOT_ALLOWED(1201, "Setting oneself as the parent menu is not allowed."),
    PARENT_MENU_NOT_FOUND(1202, "The parent menu does not exist."),
    PARENT_MENU_TYPE_INVALID(1203, "The parent menu's type must be either 'Directory' or 'Menu'."),

    ROLE_NOT_FOUND(1301, "The role does not exist."),
}