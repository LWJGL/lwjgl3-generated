/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/compute_variable_group_size.txt">ARB_compute_variable_group_size</a> extension.
 * 
 * <p>This extension allows applications to write generic compute shaders that operate on work groups with arbitrary dimensions. Instead of specifying a fixed
 * work group size in the compute shader, an application can use a compute shader using the {@code local_size_variable} layout qualifer to indicate a
 * variable work group size. When using such compute shaders, the new command DispatchComputeGroupSizeARB should be used to specify both a work group size
 * and work group count.</p>
 * 
 * <p>In this extension, compute shaders with fixed group sizes must be dispatched by {@link GL43#glDispatchCompute DispatchCompute} and {@link GL43#glDispatchComputeIndirect DispatchComputeIndirect}. Compute
 * shaders with variable group sizes must be dispatched via {@link #glDispatchComputeGroupSizeARB DispatchComputeGroupSizeARB}. No support is provided in this extension for indirect dispatch
 * of compute shaders with a variable group size.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3} or {@link ARBComputeShader ARB_compute_shader}.</p>
 */
public class ARBComputeVariableGroupSize {

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev and GetInteger64v. */
	public static final int
		GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344,
		GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB    = 0x90EB;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetFloati_v, GetDoublei_v and GetInteger64i_v. */
	public static final int
		GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345,
		GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB    = 0x91BF;

	/** Function address. */
	@JavadocExclude
	public final long DispatchComputeGroupSizeARB;

	@JavadocExclude
	protected ARBComputeVariableGroupSize() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public ARBComputeVariableGroupSize(FunctionProvider provider) {
		DispatchComputeGroupSizeARB = provider.getFunctionAddress("glDispatchComputeGroupSizeARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBComputeVariableGroupSize} instance of the current context. */
	public static ARBComputeVariableGroupSize getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBComputeVariableGroupSize} instance of the specified {@link GLCapabilities}. */
	public static ARBComputeVariableGroupSize getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBComputeVariableGroupSize);
	}

	static ARBComputeVariableGroupSize create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_compute_variable_group_size") ) return null;

		ARBComputeVariableGroupSize funcs = new ARBComputeVariableGroupSize(provider);

		boolean supported = checkFunctions(
			funcs.DispatchComputeGroupSizeARB
		);

		return GL.checkExtension("GL_ARB_compute_variable_group_size", funcs, supported);
	}

	// --- [ glDispatchComputeGroupSizeARB ] ---

	/**
	 * Launches one or more compute work groups, with arbitrary dimensions.
	 * 
	 * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated by DispatchComputeGroupSizeARB if the active program for the compute shader stage has a fixed work group
	 * size.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated by DispatchComputeGroupSizeARB if any of {@code group_size_x}, {@code group_size_y}, or {@code group_size_z} is
	 * less than or equal to zero or greater than the maximum local work group size for compute shaders with variable group size
	 * ({@link #GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB}) in the corresponding dimension.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated by DispatchComputeGroupSizeARB if the product of {@code group_size_x}, {@code group_size_y}, and
	 * {@code group_size_z} exceeds the implementation-dependent maximum local work group invocation count for compute shaders with variable group size
	 * ({@link #GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB}).</p>
	 *
	 * @param num_groups_x the number of work groups to be launched in the X dimension
	 * @param num_groups_y the number of work groups to be launched in the Y dimension
	 * @param num_groups_z the number of work groups to be launched in the Z dimension
	 * @param group_size_x the group size in the X dimension
	 * @param group_size_y the group size in the Y dimension
	 * @param group_size_z the group size in the Z dimension
	 */
	public static void glDispatchComputeGroupSizeARB(int num_groups_x, int num_groups_y, int num_groups_z, int group_size_x, int group_size_y, int group_size_z) {
		long __functionAddress = getInstance().DispatchComputeGroupSizeARB;
		callIIIIIIV(__functionAddress, num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z);
	}

}