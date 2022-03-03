package org.keycloak.social.weixin;

import org.apache.http.HttpResponse;
import javax.ws.rs.core.Response;

public class JsonResponse {
    public static Response fromJson(String json) {
        return Response.status(200).entity(json).build();
    }
}
