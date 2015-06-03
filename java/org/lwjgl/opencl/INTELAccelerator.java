/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/intel/cl_intel_accelerator.txt">intel_accelerator</a> extension.
 * 
 * <p>The accelerator extension consists of a unified set of OpenCL runtime APIs to create, query, and manage the lifetime of objects which represent
 * acceleration processors, engines, or algorithms. Accelerator object instances are referenced with the generic cl_accelerator_intel type by the runtime
 * API, but they are always associated with a specific acceleration engine type, which is assigned by the application at accelerator object creation time.
 * Descriptors are used to assign acceleration engine-specific properties to the accelerator objects. This mechanism of specialized creation with generic
 * referencing is analogous to the way image objects are managed in the OpenCL 1.2 runtime API via generic cl_mem referencing but specialized
 * descriptor-based creation with {@link CL12#clCreateImage CreateImage}.</p>
 * 
 * <p>Each accelerator object is assigned a unique type id. Vendors are freely encouraged to define new accelerator types and ids. This base extension
 * provides unified mechanism for the creation and lifetime management of new accelerator types, but the semantics and creation descriptors of these types
 * are to be defined in acceleration engine-specific extensions.</p>
 * 
 * <p>Accelerator objects can be supplied to kernels as arguments. Unless an extension defines a new OpenCL C language type for the engine-specific
 * accelerator (e.g. sampler_t), accelerator objects can only be used in conjunction with built-in kernels. If an extension does define such a new type,
 * or if it provides a mechanism to access accelerator data within kernels, then accelerator objects can act as regular kernel arguments as well.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class INTELAccelerator {

	/** Possible values for cl_accelerator_info_intel. */
	public static final int
		CL_ACCELERATOR_DESCRIPTOR_INTEL      = 0x4090,
		CL_ACCELERATOR_REFERENCE_COUNT_INTEL = 0x4091,
		CL_ACCELERATOR_CONTEXT_INTEL         = 0x4092,
		CL_ACCELERATOR_TYPE_INTEL            = 0x4093;

	/** Error codes used by functions in this extension. */
	public static final int
		CL_INVALID_ACCELERATOR_INTEL            = 0xFFFFFBBA,
		CL_INVALID_ACCELERATOR_TYPE_INTEL       = 0xFFFFFBB9,
		CL_INVALID_ACCELERATOR_DESCRIPTOR_INTEL = 0xFFFFFBB8,
		CL_ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL = 0xFFFFFBB7;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateAcceleratorINTEL,
		RetainAcceleratorINTEL,
		ReleaseAcceleratorINTEL,
		GetAcceleratorInfoINTEL;

	@JavadocExclude
	public INTELAccelerator(FunctionProvider provider) {
		CreateAcceleratorINTEL = provider.getFunctionAddress("clCreateAcceleratorINTEL");
		RetainAcceleratorINTEL = provider.getFunctionAddress("clRetainAcceleratorINTEL");
		ReleaseAcceleratorINTEL = provider.getFunctionAddress("clReleaseAcceleratorINTEL");
		GetAcceleratorInfoINTEL = provider.getFunctionAddress("clGetAcceleratorInfoINTEL");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link INTELAccelerator} instance for the currently loaded ICD. */
	public static INTELAccelerator getInstance() {
		return checkFunctionality(CL.getICD().__INTELAccelerator);
	}

	static INTELAccelerator create(FunctionProvider provider) {
		INTELAccelerator funcs = new INTELAccelerator(provider);

		boolean supported = checkFunctions(
			funcs.CreateAcceleratorINTEL, funcs.RetainAcceleratorINTEL, funcs.ReleaseAcceleratorINTEL, funcs.GetAcceleratorInfoINTEL
		);

		return supported ? funcs : null;
	}

	// --- [ clCreateAcceleratorINTEL ] ---

	/** JNI method for {@link #clCreateAcceleratorINTEL CreateAcceleratorINTEL} */
	@JavadocExclude
	public static native long nclCreateAcceleratorINTEL(long context, int accelerator_type, long descriptor_size, long descriptor, long errcode_ret, long __functionAddress);

	/** Unsafe version of {@link #clCreateAcceleratorINTEL CreateAcceleratorINTEL} */
	@JavadocExclude
	public static long nclCreateAcceleratorINTEL(long context, int accelerator_type, long descriptor_size, long descriptor, long errcode_ret) {
		long __functionAddress = getInstance().CreateAcceleratorINTEL;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nclCreateAcceleratorINTEL(context, accelerator_type, descriptor_size, descriptor, errcode_ret, __functionAddress);
	}

	/**
	 * Accelerator objects represent the programmable state of an acceleration processor, engine, or algorithm. Accelerator objects can be supplied to kernels
	 * as arguments. Unless an extension defines a new OpenCL C language type for the engine-specific accelerator (e.g. sampler_t), accelerator objects can
	 * only be used in conjunction with built-in kernels.
	 * 
	 * <p>This function creates an accelerator object. The accelerator object will be created with a reference count of one. Accelerator objects created with
	 * this function have semantics defined by the parameter {@code accelerator_type}, which are defined and described by extensions external to this
	 * document.</p>
	 *
	 * @param context          a valid OpenCL context
	 * @param accelerator_type specifies the type of accelerator object created. The type constants are defined by acceleration engine-specific extensions. It is encouraged that
	 *                         extensions follow the naming scheme of CL_ACCELERATOR_TYPE_{name}_INTEL where {name} is a descriptive acceleration engine string.
	 * @param descriptor_size  a value which specifies of the size, in bytes, of the immediately following descriptor structure
	 * @param descriptor       a pointer to a structure that defines the parameter set of the accelerator object. This parameter set describes the configurable state of the
	 *                         underlying object. The actual structure supplied must be consistent with {@code accelerator_type}. The descriptor structures are defined by
	 *                         acceleration engine-specific extensions. It is encouraged that extensions follow the naming scheme of cl_{name}_desc_INTEL where {name} is a
	 *                         descriptive acceleration engine string.
	 * @param errcode_ret      will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero accelerator object, and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the accelerator object is created successfully. Otherwise, it returns a
	 *         {@code NULL} value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
	 *         <li>{@link #CL_INVALID_ACCELERATOR_TYPE_INTEL INVALID_ACCELERATOR_TYPE_INTEL} if the supplied accelerator type is not valid.</li>
	 *         <li>{@link #CL_INVALID_ACCELERATOR_DESCRIPTOR_INTEL INVALID_ACCELERATOR_DESCRIPTOR_INTEL} if values specified in {@code accelerator_desc} are not valid (or a combination of values is not valid) or if
	 *         {@code accelerator_desc} is {@code NULL}.</li>
	 *         <li>{@link #CL_ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL} if the supplied accelerator type is not supported by the context.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if none of the devices in the context support accelerator objects.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static long clCreateAcceleratorINTEL(long context, int accelerator_type, long descriptor_size, ByteBuffer descriptor, ByteBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(descriptor, descriptor_size);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return nclCreateAcceleratorINTEL(context, accelerator_type, descriptor_size, memAddress(descriptor), memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateAcceleratorINTEL CreateAcceleratorINTEL} */
	public static long clCreateAcceleratorINTEL(long context, int accelerator_type, ByteBuffer descriptor, IntBuffer errcode_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateAcceleratorINTEL(context, accelerator_type, descriptor.remaining(), memAddress(descriptor), memAddressSafe(errcode_ret));
	}

	// --- [ clRetainAcceleratorINTEL ] ---

	/** JNI method for {@link #clRetainAcceleratorINTEL RetainAcceleratorINTEL} */
	@JavadocExclude
	public static native int nclRetainAcceleratorINTEL(long accelerator, long __functionAddress);

	/**
	 * Increments the accelerator reference count. {@link #clCreateAcceleratorINTEL CreateAcceleratorINTEL} does an implicit retain.
	 *
	 * @param accelerator a valid accelerator object
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_ACCELERATOR_INTEL INVALID_ACCELERATOR_INTEL} if accelerator is a not a valid accelerator object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clRetainAcceleratorINTEL(long accelerator) {
		long __functionAddress = getInstance().RetainAcceleratorINTEL;
		if ( LWJGLUtil.CHECKS )
			checkPointer(accelerator);
		return nclRetainAcceleratorINTEL(accelerator, __functionAddress);
	}

	// --- [ clReleaseAcceleratorINTEL ] ---

	/** JNI method for {@link #clReleaseAcceleratorINTEL ReleaseAcceleratorINTEL} */
	@JavadocExclude
	public static native int nclReleaseAcceleratorINTEL(long accelerator, long __functionAddress);

	/**
	 * Decrements the accelerator reference count. The accelerator object is deleted after the reference count becomes zero and commands queued for execution
	 * on a command-queue(s) that reference accelerator have finished.
	 *
	 * @param accelerator a valid accelerator object
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link #CL_INVALID_ACCELERATOR_INTEL INVALID_ACCELERATOR_INTEL} if accelerator is a not a valid accelerator object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clReleaseAcceleratorINTEL(long accelerator) {
		long __functionAddress = getInstance().ReleaseAcceleratorINTEL;
		if ( LWJGLUtil.CHECKS )
			checkPointer(accelerator);
		return nclReleaseAcceleratorINTEL(accelerator, __functionAddress);
	}

	// --- [ clGetAcceleratorInfoINTEL ] ---

	/** JNI method for {@link #clGetAcceleratorInfoINTEL GetAcceleratorInfoINTEL} */
	@JavadocExclude
	public static native int nclGetAcceleratorInfoINTEL(long accelerator, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/** Unsafe version of {@link #clGetAcceleratorInfoINTEL GetAcceleratorInfoINTEL} */
	@JavadocExclude
	public static int nclGetAcceleratorInfoINTEL(long accelerator, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = getInstance().GetAcceleratorInfoINTEL;
		if ( LWJGLUtil.CHECKS )
			checkPointer(accelerator);
		return nclGetAcceleratorInfoINTEL(accelerator, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
	}

	/**
	 * Returns information about the accelerator object.
	 *
	 * @param accelerator          the accelerator object being queried
	 * @param param_name           the information to query. One of:<br>{@link #CL_ACCELERATOR_DESCRIPTOR_INTEL ACCELERATOR_DESCRIPTOR_INTEL}, {@link #CL_ACCELERATOR_REFERENCE_COUNT_INTEL ACCELERATOR_REFERENCE_COUNT_INTEL}, {@link #CL_ACCELERATOR_CONTEXT_INTEL ACCELERATOR_CONTEXT_INTEL}, {@link #CL_ACCELERATOR_TYPE_INTEL ACCELERATOR_TYPE_INTEL}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid or if size in bytes specified by {@code param_value_size} is &lt; size of return type and
	 *         {@code param_value} is not {@code NULL}.</li>
	 *         <li>{@link #CL_INVALID_ACCELERATOR_INTEL INVALID_ACCELERATOR_INTEL} if accelerator is a not a valid accelerator object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetAcceleratorInfoINTEL(long accelerator, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS ) {
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetAcceleratorInfoINTEL(accelerator, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** Alternative version of: {@link #clGetAcceleratorInfoINTEL GetAcceleratorInfoINTEL} */
	public static int clGetAcceleratorInfoINTEL(long accelerator, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetAcceleratorInfoINTEL(accelerator, param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** IntBuffer version of: {@link #clGetAcceleratorInfoINTEL GetAcceleratorInfoINTEL} */
	public static int clGetAcceleratorInfoINTEL(long accelerator, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetAcceleratorInfoINTEL(accelerator, param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetAcceleratorInfoINTEL GetAcceleratorInfoINTEL} */
	public static int clGetAcceleratorInfoINTEL(long accelerator, int param_name, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( LWJGLUtil.CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetAcceleratorInfoINTEL(accelerator, param_name, (param_value == null ? 0 : param_value.remaining()) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

}