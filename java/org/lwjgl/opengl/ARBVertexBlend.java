/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_blend.txt">ARB_vertex_blend</a> extension.
 * 
 * <p>This extension provides the ability to replace the single modelview transformation with a set of n vertex units. (Where n is constrained to an
 * implementation defined maximum.) Each unit has its own modelview transform matrix. For each unit, there is a current weight associated with the vertex.
 * When this extension is enabled the vertices are transformed by the modelview matrices of all of the enabled units. Afterward, these results are scaled
 * by the weights for the respective units and then summed to create the eye-space vertex. A similar procedure is followed for the normals, except they are
 * transformed by the inverse transpose of the modelview matrices.</p>
 */
public final class ARBVertexBlend {

	/** Accepted by the {@code value} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_UNITS_ARB    = 0x86A4,
		GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;

	/**
	 * Accepted by the {@code cap} parameters of Enable and Disable, by the {@code value} parameter of IsEnabled, GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_WEIGHT_SUM_UNITY_ARB = 0x86A6,
		GL_VERTEX_BLEND_ARB     = 0x86A7;

	/** Accepted by the {@code mode} parameter of MatrixMode and by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MODELVIEW0_ARB  = 0x1700,
		GL_MODELVIEW1_ARB  = 0x850A,
		GL_MODELVIEW2_ARB  = 0x8722,
		GL_MODELVIEW3_ARB  = 0x8723,
		GL_MODELVIEW4_ARB  = 0x8724,
		GL_MODELVIEW5_ARB  = 0x8725,
		GL_MODELVIEW6_ARB  = 0x8726,
		GL_MODELVIEW7_ARB  = 0x8727,
		GL_MODELVIEW8_ARB  = 0x8728,
		GL_MODELVIEW9_ARB  = 0x8729,
		GL_MODELVIEW10_ARB = 0x872A,
		GL_MODELVIEW11_ARB = 0x872B,
		GL_MODELVIEW12_ARB = 0x872C,
		GL_MODELVIEW13_ARB = 0x872D,
		GL_MODELVIEW14_ARB = 0x872E,
		GL_MODELVIEW15_ARB = 0x872F,
		GL_MODELVIEW16_ARB = 0x8730,
		GL_MODELVIEW17_ARB = 0x8731,
		GL_MODELVIEW18_ARB = 0x8732,
		GL_MODELVIEW19_ARB = 0x8733,
		GL_MODELVIEW20_ARB = 0x8734,
		GL_MODELVIEW21_ARB = 0x8735,
		GL_MODELVIEW22_ARB = 0x8736,
		GL_MODELVIEW23_ARB = 0x8737,
		GL_MODELVIEW24_ARB = 0x8738,
		GL_MODELVIEW25_ARB = 0x8739,
		GL_MODELVIEW26_ARB = 0x873A,
		GL_MODELVIEW27_ARB = 0x873B,
		GL_MODELVIEW28_ARB = 0x873C,
		GL_MODELVIEW29_ARB = 0x873D,
		GL_MODELVIEW30_ARB = 0x873E,
		GL_MODELVIEW31_ARB = 0x873F;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_WEIGHT_ARRAY_TYPE_ARB   = 0x86A9,
		GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA,
		GL_WEIGHT_ARRAY_SIZE_ARB   = 0x86AB;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;

	/**
	 * Accepted by the {@code cap} parameters of EnableClientState and DisableClientState, by the {@code value} parameter of IsEnabled, GetBooleanv,
	 * GetIntegerv, GetFloatv, and GetDoublev.
	 */
	public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;

	/** Function address. */
	@JavadocExclude
	public final long
		WeightfvARB,
		WeightbvARB,
		WeightubvARB,
		WeightsvARB,
		WeightusvARB,
		WeightivARB,
		WeightuivARB,
		WeightdvARB,
		WeightPointerARB,
		VertexBlendARB;

	@JavadocExclude
	public ARBVertexBlend(FunctionProvider provider) {
		WeightfvARB = provider.getFunctionAddress("glWeightfvARB");
		WeightbvARB = provider.getFunctionAddress("glWeightbvARB");
		WeightubvARB = provider.getFunctionAddress("glWeightubvARB");
		WeightsvARB = provider.getFunctionAddress("glWeightsvARB");
		WeightusvARB = provider.getFunctionAddress("glWeightusvARB");
		WeightivARB = provider.getFunctionAddress("glWeightivARB");
		WeightuivARB = provider.getFunctionAddress("glWeightuivARB");
		WeightdvARB = provider.getFunctionAddress("glWeightdvARB");
		WeightPointerARB = provider.getFunctionAddress("glWeightPointerARB");
		VertexBlendARB = provider.getFunctionAddress("glVertexBlendARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexBlend} instance for the current context. */
	public static ARBVertexBlend getInstance() {
		return GL.getCapabilities().__ARBVertexBlend;
	}

	static ARBVertexBlend create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_vertex_blend") ) return null;

		ARBVertexBlend funcs = new ARBVertexBlend(provider);

		boolean supported = checkFunctions(
			funcs.WeightfvARB, funcs.WeightbvARB, funcs.WeightubvARB, funcs.WeightsvARB, funcs.WeightusvARB, funcs.WeightivARB, funcs.WeightuivARB, 
			funcs.WeightdvARB, funcs.WeightPointerARB, funcs.VertexBlendARB
		);

		return GL.checkExtension("GL_ARB_vertex_blend", funcs, supported);
	}

	// --- [ glWeightfvARB ] ---

	/** JNI method for {@link #glWeightfARB(int, ByteBuffer) WeightfARB} */
	@JavadocExclude
	public static native void nglWeightfvARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightfARB(int, ByteBuffer) WeightfARB} */
	@JavadocExclude
	public static void nglWeightfvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightfvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightfvARB(size, weights, __functionAddress);
	}

	/**
	 * Sets the current vertex weights.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightfARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size << 2);
		nglWeightfvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightfARB(int, ByteBuffer) WeightfARB} */
	public static void glWeightARB(FloatBuffer weights) {
		nglWeightfvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightbvARB ] ---

	/** JNI method for {@link #glWeightbARB(int, ByteBuffer) WeightbARB} */
	@JavadocExclude
	public static native void nglWeightbvARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightbARB(int, ByteBuffer) WeightbARB} */
	@JavadocExclude
	public static void nglWeightbvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightbvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightbvARB(size, weights, __functionAddress);
	}

	/**
	 * Byte version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightbARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size);
		nglWeightbvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightbARB(int, ByteBuffer) WeightbARB} */
	public static void glWeightbARB(ByteBuffer weights) {
		nglWeightbvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightubvARB ] ---

	/** JNI method for {@link #glWeightubARB(int, ByteBuffer) WeightubARB} */
	@JavadocExclude
	public static native void nglWeightubvARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightubARB(int, ByteBuffer) WeightubARB} */
	@JavadocExclude
	public static void nglWeightubvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightubvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightubvARB(size, weights, __functionAddress);
	}

	/**
	 * Unsigned byte version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightubARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size);
		nglWeightubvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightubARB(int, ByteBuffer) WeightubARB} */
	public static void glWeightubARB(ByteBuffer weights) {
		nglWeightubvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightsvARB ] ---

	/** JNI method for {@link #glWeightsARB(int, ByteBuffer) WeightsARB} */
	@JavadocExclude
	public static native void nglWeightsvARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightsARB(int, ByteBuffer) WeightsARB} */
	@JavadocExclude
	public static void nglWeightsvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightsvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightsvARB(size, weights, __functionAddress);
	}

	/**
	 * Short version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightsARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size << 1);
		nglWeightsvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightsARB(int, ByteBuffer) WeightsARB} */
	public static void glWeightARB(ShortBuffer weights) {
		nglWeightsvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightusvARB ] ---

	/** JNI method for {@link #glWeightusARB(int, ByteBuffer) WeightusARB} */
	@JavadocExclude
	public static native void nglWeightusvARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightusARB(int, ByteBuffer) WeightusARB} */
	@JavadocExclude
	public static void nglWeightusvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightusvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightusvARB(size, weights, __functionAddress);
	}

	/**
	 * Unsigned short version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightusARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size << 1);
		nglWeightusvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightusARB(int, ByteBuffer) WeightusARB} */
	public static void glWeightuARB(ShortBuffer weights) {
		nglWeightusvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightivARB ] ---

	/** JNI method for {@link #glWeightiARB(int, ByteBuffer) WeightiARB} */
	@JavadocExclude
	public static native void nglWeightivARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightiARB(int, ByteBuffer) WeightiARB} */
	@JavadocExclude
	public static void nglWeightivARB(int size, long weights) {
		long __functionAddress = getInstance().WeightivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightivARB(size, weights, __functionAddress);
	}

	/**
	 * Integer version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightiARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size << 2);
		nglWeightivARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightiARB(int, ByteBuffer) WeightiARB} */
	public static void glWeightARB(IntBuffer weights) {
		nglWeightivARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightuivARB ] ---

	/** JNI method for {@link #glWeightuiARB(int, ByteBuffer) WeightuiARB} */
	@JavadocExclude
	public static native void nglWeightuivARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightuiARB(int, ByteBuffer) WeightuiARB} */
	@JavadocExclude
	public static void nglWeightuivARB(int size, long weights) {
		long __functionAddress = getInstance().WeightuivARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightuivARB(size, weights, __functionAddress);
	}

	/**
	 * Unsigned integer version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightuiARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size << 2);
		nglWeightuivARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightuiARB(int, ByteBuffer) WeightuiARB} */
	public static void glWeightuARB(IntBuffer weights) {
		nglWeightuivARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightdvARB ] ---

	/** JNI method for {@link #glWeightdARB(int, ByteBuffer) WeightdARB} */
	@JavadocExclude
	public static native void nglWeightdvARB(int size, long weights, long __functionAddress);

	/** Unsafe version of {@link #glWeightdARB(int, ByteBuffer) WeightdARB} */
	@JavadocExclude
	public static void nglWeightdvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightdvARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightdvARB(size, weights, __functionAddress);
	}

	/**
	 * Double version of {@link #glWeightfARB WeightfARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightdARB(int size, ByteBuffer weights) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(weights, size << 3);
		nglWeightdvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightdARB(int, ByteBuffer) WeightdARB} */
	public static void glWeightARB(DoubleBuffer weights) {
		nglWeightdvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightPointerARB ] ---

	/** JNI method for {@link #glWeightPointerARB WeightPointerARB} */
	@JavadocExclude
	public static native void nglWeightPointerARB(int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glWeightPointerARB WeightPointerARB} */
	@JavadocExclude
	public static void nglWeightPointerARB(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().WeightPointerARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWeightPointerARB(size, type, stride, pointer, __functionAddress);
	}

	/**
	 * Specifies the location and organization of a weight array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param type    the data type of the values stored in the array. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the weight data
	 */
	public static void glWeightPointerARB(int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglWeightPointerARB(size, type, stride, pointerOffset);
	}

	/** GL_FLOAT version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, GL11.GL_FLOAT, stride, memAddress(pointer));
	}

	// --- [ glVertexBlendARB ] ---

	/** JNI method for {@link #glVertexBlendARB VertexBlendARB} */
	@JavadocExclude
	public static native void nglVertexBlendARB(int count, long __functionAddress);

	/**
	 * Sets the number of active transformations applied.
	 *
	 * @param count the number of transformations to blend
	 */
	public static void glVertexBlendARB(int count) {
		long __functionAddress = getInstance().VertexBlendARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexBlendARB(count, __functionAddress);
	}

}