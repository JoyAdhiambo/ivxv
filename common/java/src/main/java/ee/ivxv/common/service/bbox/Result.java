package ee.ivxv.common.service.bbox;

public enum Result {
    OK, //
    INVALID_FILE_NAME, MISSING_FILE, REPEATED_FILE, UNKNOWN_FILE_TYPE, //
    INVALID_BALLOT_SIGNATURE, MISSING_VOTER_SIGNATURE, VOTER_NOT_FOUND, TIME_BEFORE_START, //
    REG_RESP_INVALID, REG_REQ_INVALID, //
    REG_RESP_NOT_UNIQUE, REG_REQ_NOT_UNIQUE, //
    REG_NO_NONCE, REG_NONCE_NOT_SIG, REG_NONCE_ALG_MISMATCH, REG_NONCE_SIG_INVALID, //
    UNKNOWN_FILE_IN_VOTE_CONTAINER, TECHNICAL_ERROR, //
    REG_RESP_REQ_UNMATCH, REG_REQ_WITHOUT_BALLOT, BALLOT_WITHOUT_REG_REQ, //
    SAME_TIME_AS_LATEST, INVALID_SIGNATURE_PROFILE, //
}
