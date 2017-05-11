/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/EXT/polygon_offset_clamp.txt">EXT_polygon_offset_clamp</a> extension.
 * 
 * <p>This extension adds a new parameter to the polygon offset function that clamps the calculated offset to a minimum or maximum value. The clamping
 * functionality is useful when polygons are nearly parallel to the view direction because their high slopes can result in arbitrarily large polygon
 * offsets. In the particular case of shadow mapping, the lack of clamping can produce the appearance of unwanted holes when the shadow casting polygons
 * are offset beyond the shadow receiving polygons, and this problem can be alleviated by enforcing a maximum offset value.</p>
 * 
 * <p>Requires {@link GL33 OpenGL 3.3}.</p>
 */
public class EXTPolygonOffsetClamp {

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_POLYGON_OFFSET_CLAMP_EXT = 0x8E1B;

    static { GL.initialize(); }

    protected EXTPolygonOffsetClamp() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glPolygonOffsetClampEXT
        );
    }

    // --- [ glPolygonOffsetClampEXT ] ---

    /**
     * The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. The
     * function that determines this value is specified with this command.
     * 
     * <p>{@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable
     * resolution of the depth buffer. The resulting values are summed to produce the polygon offset value, which may then be clamped to a minimum or maximum
     * value specified by {@code clamp}. The values {@code factor}, {@code units}, and {@code clamp} may each be positive, negative, or zero. Calling the
     * command {@link GL11#glPolygonOffset PolygonOffset} is equivalent to calling the command PolygonOffsetClampEXT with {@code clamp} equal to zero."</p>
     *
     * @param factor scales the maximum depth slope of the polygon
     * @param units  scales an implementation-dependent constant that relates to the usable resolution of the depth buffer
     * @param clamp  the minimum or maximum clamp value
     */
    public static native void glPolygonOffsetClampEXT(float factor, float units, float clamp);

}