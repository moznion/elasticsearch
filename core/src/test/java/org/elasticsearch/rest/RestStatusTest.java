package org.elasticsearch.rest;

import org.elasticsearch.test.ESTestCase;

public class RestStatusTest extends ESTestCase {
    public void testIsSuccess() throws Exception {
        // 1xx (should false)
        assertFalse(RestStatus.CONTINUE.isSuccess());
        assertFalse(RestStatus.SWITCHING_PROTOCOLS.isSuccess());

        // 2xx (should true)
        assertTrue(RestStatus.OK.isSuccess());
        assertTrue(RestStatus.CREATED.isSuccess());
        assertTrue(RestStatus.ACCEPTED.isSuccess());
        assertTrue(RestStatus.NON_AUTHORITATIVE_INFORMATION.isSuccess());
        assertTrue(RestStatus.NO_CONTENT.isSuccess());
        assertTrue(RestStatus.RESET_CONTENT.isSuccess());
        assertTrue(RestStatus.PARTIAL_CONTENT.isSuccess());
        assertTrue(RestStatus.MULTI_STATUS.isSuccess());

        // 3xx (should false)
        assertFalse(RestStatus.MULTIPLE_CHOICES.isSuccess());
        assertFalse(RestStatus.MOVED_PERMANENTLY.isSuccess());
        assertFalse(RestStatus.FOUND.isSuccess());
        assertFalse(RestStatus.SEE_OTHER.isSuccess());
        assertFalse(RestStatus.NOT_MODIFIED.isSuccess());
        assertFalse(RestStatus.USE_PROXY.isSuccess());
        assertFalse(RestStatus.TEMPORARY_REDIRECT.isSuccess());

        // 4xx (should false)
        assertFalse(RestStatus.BAD_REQUEST.isSuccess());
        assertFalse(RestStatus.UNAUTHORIZED.isSuccess());
        assertFalse(RestStatus.PAYMENT_REQUIRED.isSuccess());
        assertFalse(RestStatus.FORBIDDEN.isSuccess());
        assertFalse(RestStatus.NOT_FOUND.isSuccess());
        assertFalse(RestStatus.METHOD_NOT_ALLOWED.isSuccess());
        assertFalse(RestStatus.NOT_ACCEPTABLE.isSuccess());
        assertFalse(RestStatus.PROXY_AUTHENTICATION.isSuccess());
        assertFalse(RestStatus.REQUEST_TIMEOUT.isSuccess());
        assertFalse(RestStatus.CONFLICT.isSuccess());
        assertFalse(RestStatus.GONE.isSuccess());
        assertFalse(RestStatus.LENGTH_REQUIRED.isSuccess());
        assertFalse(RestStatus.PRECONDITION_FAILED.isSuccess());
        assertFalse(RestStatus.REQUEST_ENTITY_TOO_LARGE.isSuccess());
        assertFalse(RestStatus.REQUEST_URI_TOO_LONG.isSuccess());
        assertFalse(RestStatus.UNSUPPORTED_MEDIA_TYPE.isSuccess());
        assertFalse(RestStatus.REQUESTED_RANGE_NOT_SATISFIED.isSuccess());
        assertFalse(RestStatus.EXPECTATION_FAILED.isSuccess());
        assertFalse(RestStatus.UNPROCESSABLE_ENTITY.isSuccess());
        assertFalse(RestStatus.LOCKED.isSuccess());
        assertFalse(RestStatus.FAILED_DEPENDENCY.isSuccess());
        assertFalse(RestStatus.TOO_MANY_REQUESTS.isSuccess());

        // 5xx (should false)
        assertFalse(RestStatus.INTERNAL_SERVER_ERROR.isSuccess());
        assertFalse(RestStatus.NOT_IMPLEMENTED.isSuccess());
        assertFalse(RestStatus.BAD_GATEWAY.isSuccess());
        assertFalse(RestStatus.SERVICE_UNAVAILABLE.isSuccess());
        assertFalse(RestStatus.GATEWAY_TIMEOUT.isSuccess());
        assertFalse(RestStatus.HTTP_VERSION_NOT_SUPPORTED.isSuccess());
        assertFalse(RestStatus.INSUFFICIENT_STORAGE.isSuccess());
    }
}
