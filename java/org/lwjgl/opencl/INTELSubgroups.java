/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/intel/cl_intel_subgroups.txt">intel_subgroups</a> extension.
 * 
 * <p>The goal of this extension is to allow programmers to improve the performance of their applications by taking advantage of the fact that some work
 * items in a work group execute together as a group (a "subgroup"), and that work items in a subgroup can take advantage of hardware features that are
 * not available to work items in a work group. Specifically, this extension is designed to allow work items in a subgroup to share data without the use
 * of local memory and work group barriers, and to utilize specialized hardware to load and store blocks of data.</p>
 * 
 * <p>There is a large amount of overlap between the functionality in this extension and the functionality in the Khronos OpenCL 2.0 "cl_khr_subgroups"
 * extension, so this extension reuses many of the names, concepts, and functions already described in the cl_khr_subgroups extension. The key differences
 * between the Intel subgroups extension and the Khronos subgroups extension are:</p>
 * 
 * <ul>
 * <li>The Khronos subgroups extension requires OpenCL 2.0, but the Intel subgroups extension may be available on OpenCL 1.2 devices.</li>
 * <li>The Khronos subgroups extension guarantees that subgroups in a work group will make independent forward progress, but the Intel extension does not
 * guarantee that subgroups in a work group will make independent forward progress.</li>
 * <li>The Intel extension adds a rich set of subgroup "shuffle" functions to allow work items within a work group to interchange data without the use of
 * local memory and work group barriers.</li>
 * <li>The Intel extension adds a set of subgroup "block read and write" functions to take advantage of specialized hardware to read or write blocks of
 * data from or to buffers or images.</li>
 * <li>The Intel subgroups extension does not include the subgroup pipes functions that are included as part of the Khronos subgroups extension.</li>
 * <li>The Intel subgroups extension does not include the device-side kernel query functions for subgroups that are included as part of the Khronos
 * subgroups extension.</li>
 * </ul>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public class INTELSubgroups {

	/** Accepted as the {@code param_name} parameter of {@link #clGetKernelSubGroupInfoKHR GetKernelSubGroupInfoKHR}. */
	public static final int
		CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR = 0x2033,
		CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR    = 0x2034;

	protected INTELSubgroups() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(CLCapabilities caps) {
		return checkFunctions(
			caps.clGetKernelSubGroupInfoKHR
		);
	}

	// --- [ clGetKernelSubGroupInfoKHR ] ---

	/**
	 * Returns information about a kernel object.
	 *
	 * @param kernel               the kernel object being queried
	 * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL
	 *                             context that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a
	 *                             {@code NULL} value.
	 * @param param_name           specifies the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR}</td><td>{@link #CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR}</td></tr></table>
	 * @param input_value_size     specifies the size in bytes of memory pointed to by {@code input_value}. This size must be equal to the size of the input type.
	 * @param input_value          a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is {@code NULL} it is ignored.
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int nclGetKernelSubGroupInfoKHR(long kernel, long device, int param_name, long input_value_size, long input_value, long param_value_size, long param_value, long param_value_size_ret) {
		long __functionAddress = CL.getICD().clGetKernelSubGroupInfoKHR;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(kernel);
		}
		return callPPPPPPPI(__functionAddress, kernel, device, param_name, input_value_size, input_value, param_value_size, param_value, param_value_size_ret);
	}

	/**
	 * Returns information about a kernel object.
	 *
	 * @param kernel               the kernel object being queried
	 * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL
	 *                             context that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a
	 *                             {@code NULL} value.
	 * @param param_name           specifies the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR}</td><td>{@link #CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR}</td></tr></table>
	 * @param input_value          a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is {@code NULL} it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 */
	public static int clGetKernelSubGroupInfoKHR(long kernel, long device, int param_name, ByteBuffer input_value, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelSubGroupInfoKHR(kernel, device, param_name, (long)input_value.remaining(), memAddress(input_value), (long)(param_value == null ? 0 : param_value.remaining()), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

	/** PointerBuffer version of: {@link #clGetKernelSubGroupInfoKHR GetKernelSubGroupInfoKHR} */
	public static int clGetKernelSubGroupInfoKHR(long kernel, long device, int param_name, ByteBuffer input_value, PointerBuffer param_value, PointerBuffer param_value_size_ret) {
		if ( CHECKS )
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		return nclGetKernelSubGroupInfoKHR(kernel, device, param_name, (long)input_value.remaining(), memAddress(input_value), (param_value == null ? 0 : param_value.remaining() << POINTER_SHIFT), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
	}

}