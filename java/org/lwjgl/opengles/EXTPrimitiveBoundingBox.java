/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_primitive_bounding_box.txt">EXT_primitive_bounding_box</a> extension.
 * 
 * <p>On tile-based architectures, transformed primitives are generally written out to memory before rasterization, and then read back from memory for each
 * tile they intersect. When geometry expands during transformation due to tessellation or one-to-many geometry shaders, the external bandwidth required
 * grows proportionally. This extension provides a way for implementations to know which tiles incoming geometry will intersect before fully transforming
 * (and expanding) the geometry. This allows them to only store the unexpanded geometry in memory, and perform expansion on-chip for each intersected
 * tile.</p>
 * 
 * <p>New state is added to hold an axis-aligned bounding box which is assumed to contain any geometry submitted. An implementation is allowed to ignore any
 * portions of primitives outside the bounding box; thus if a primitive extends outside of a tile into a neighboring tile that the bounding box didn't
 * intersect, the implementation is not required to render those portions. The tessellation control shader is optionally able to specify a per-patch
 * bounding box that overrides the bounding box state for primitives generated from that patch, in order to provide tighter bounds.</p>
 * 
 * <p>The typical usage is that an application will have an object-space bounding volume for a primitive or group of primitives, either calculated at runtime
 * or provided with the mesh by the authoring tool or content pipeline. It will transform this volume to clip space, compute an axis-aligned bounding box
 * that contains the transformed bounding volume, and provide that at either per-patch or per-draw granularity.</p>
 * 
 * <p>Requires {@link GLES31 GLES E.S}.</p>
 */
public final class EXTPrimitiveBoundingBox {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int GL_PRIMITIVE_BOUNDING_BOX_EXT = 0x92BE;

	/** Function address. */
	@JavadocExclude
	public final long PrimitiveBoundingBoxEXT;

	@JavadocExclude
	public EXTPrimitiveBoundingBox(FunctionProvider provider) {
		PrimitiveBoundingBoxEXT = provider.getFunctionAddress("glPrimitiveBoundingBoxEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTPrimitiveBoundingBox} instance for the current context. */
	public static EXTPrimitiveBoundingBox getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTPrimitiveBoundingBox);
	}

	static EXTPrimitiveBoundingBox create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_primitive_bounding_box") ) return null;

		EXTPrimitiveBoundingBox funcs = new EXTPrimitiveBoundingBox(provider);
		boolean supported = checkFunctions(
			funcs.PrimitiveBoundingBoxEXT
		);

		return GLES.checkExtension("GL_EXT_primitive_bounding_box", funcs, supported);
	}

	// --- [ glPrimitiveBoundingBoxEXT ] ---

	public static void glPrimitiveBoundingBoxEXT(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
		long __functionAddress = getInstance().PrimitiveBoundingBoxEXT;
		callFFFFFFFFV(__functionAddress, minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
	}

}