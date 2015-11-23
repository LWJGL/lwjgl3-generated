/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/intel/cl_intel_va_api_media_sharing.txt">intel_va_api_media_sharing</a> extension.
 * 
 * <p>The goal of this extension is to provide interoperability between OpenCL and the cross-platform Video Acceleration API (VA API). The extension
 * specifically enables sharing of VA API surfaces for media. It uses similar mechanisms and provides similar surface sharing capabilities for VA API that
 * are provided by the Khronos OpenCL 1.2 Media Surface Sharing extension for DX9.</p>
 * 
 * <p>Requires {@link CL12 CL12} and a VA API implementation supporting sharing of surfaces with OpenCL.</p>
 */
public class INTELVAAPIMediaSharing {

	/** Accepted as a VA API device source in the {@code media_adapter_type} parameter of {@link #clGetDeviceIDsFromVA_APIMediaAdapterINTEL GetDeviceIDsFromVA_APIMediaAdapterINTEL}. */
	public static final int CL_VA_API_DISPLAY_INTEL = 0x4094;

	/** Accepted as a set of VA API devices in the {@code media_adapter_set} parameter of {@link #clGetDeviceIDsFromVA_APIMediaAdapterINTEL GetDeviceIDsFromVA_APIMediaAdapterINTEL}. */
	public static final int
		CL_PREFERRED_DEVICES_FOR_VA_API_INTEL = 0x4095,
		CL_ALL_DEVICES_FOR_VA_API_INTEL       = 0x4096;

	/** Accepted as a property name in the {@code properties} parameter of {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType}. */
	public static final int CL_CONTEXT_VA_API_DISPLAY_INTEL = 0x4097;

	/** Accepted as the property being queried in the {@code param_name} parameter of {@link CL10#clGetMemObjectInfo GetMemObjectInfo}. */
	public static final int CL_MEM_VA_API_MEDIA_SURFACE_INTEL = 0x4098;

	/** Accepted as the property being queried in the {@code param_name} parameter of {@link CL10#clGetImageInfo GetImageInfo}. */
	public static final int CL_IMAGE_VA_API_PLANE_INTEL = 0x4099;

	/** Returned in the {@code param_value} parameter of {@link CL10#clGetEventInfo GetEventInfo} when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
	public static final int
		CL_COMMAND_ACQUIRE_VA_API_MEDIA_SURFACES_INTEL = 0x409A,
		CL_COMMAND_RELEASE_VA_API_MEDIA_SURFACES_INTEL = 0x409B;

	/**
	 * Returned by {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType} if the VA API display specified for interoperability is not compatible with the
	 * devices against which the context is to be created.
	 */
	public static final int CL_INVALID_VA_API_MEDIA_ADAPTER_INTEL = -1098;

	/**
	 * Returned by {@link #clCreateFromVA_APIMediaSurfaceINTEL CreateFromVA_APIMediaSurfaceINTEL} when {@code surface} is not a VA API surface of the required type, by {@link CL10#clGetMemObjectInfo GetMemObjectInfo} when
	 * {@code param_name} is {@link #CL_MEM_VA_API_MEDIA_SURFACE_INTEL MEM_VA_API_MEDIA_SURFACE_INTEL} when {@code memobj} was not created from a VA API surface, and from {@link CL10#clGetImageInfo GetImageInfo} when
	 * {@code param_name} is {@link #CL_IMAGE_VA_API_PLANE_INTEL IMAGE_VA_API_PLANE_INTEL} and {@code image} was not created from a VA API surface.
	 */
	public static final int CL_INVALID_VA_API_MEDIA_SURFACE_INTEL = -1099;

	/** Returned by {@link #clEnqueueAcquireVA_APIMediaSurfacesINTEL EnqueueAcquireVA_APIMediaSurfacesINTEL} when any of {@code mem_objects} are currently acquired by OpenCL. */
	public static final int CL_VA_API_MEDIA_SURFACE_ALREADY_ACQUIRED_INTEL = -1100;

	/** Returned by {@link #clEnqueueReleaseVA_APIMediaSurfacesINTEL EnqueueReleaseVA_APIMediaSurfacesINTEL} when any of {@code mem_objects} are not currently acquired by OpenCL. */
	public static final int CL_VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL = -1101;

	/** Function address. */
	@JavadocExclude
	public final long
		GetDeviceIDsFromVA_APIMediaAdapterINTEL,
		CreateFromVA_APIMediaSurfaceINTEL,
		EnqueueAcquireVA_APIMediaSurfacesINTEL,
		EnqueueReleaseVA_APIMediaSurfacesINTEL;

	@JavadocExclude
	protected INTELVAAPIMediaSharing() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public INTELVAAPIMediaSharing(FunctionProvider provider) {
		GetDeviceIDsFromVA_APIMediaAdapterINTEL = provider.getFunctionAddress("clGetDeviceIDsFromVA_APIMediaAdapterINTEL");
		CreateFromVA_APIMediaSurfaceINTEL = provider.getFunctionAddress("clCreateFromVA_APIMediaSurfaceINTEL");
		EnqueueAcquireVA_APIMediaSurfacesINTEL = provider.getFunctionAddress("clEnqueueAcquireVA_APIMediaSurfacesINTEL");
		EnqueueReleaseVA_APIMediaSurfacesINTEL = provider.getFunctionAddress("clEnqueueReleaseVA_APIMediaSurfacesINTEL");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link INTELVAAPIMediaSharing} instance of the currently loaded ICD. */
	public static INTELVAAPIMediaSharing getInstance() {
		return getInstance(CL.getICD());
	}

	/** Returns the {@link INTELVAAPIMediaSharing} instance of the specified {@link CLCapabilities}. */
	public static INTELVAAPIMediaSharing getInstance(CLCapabilities caps) {
		return checkFunctionality(caps.__INTELVAAPIMediaSharing);
	}

	static INTELVAAPIMediaSharing create(FunctionProvider provider) {
		INTELVAAPIMediaSharing funcs = new INTELVAAPIMediaSharing(provider);

		boolean supported = checkFunctions(
			funcs.GetDeviceIDsFromVA_APIMediaAdapterINTEL, funcs.CreateFromVA_APIMediaSurfaceINTEL, funcs.EnqueueAcquireVA_APIMediaSurfacesINTEL, 
			funcs.EnqueueReleaseVA_APIMediaSurfacesINTEL
		);

		return supported ? funcs : null;
	}

	// --- [ clGetDeviceIDsFromVA_APIMediaAdapterINTEL ] ---

	/** Unsafe version of {@link #clGetDeviceIDsFromVA_APIMediaAdapterINTEL GetDeviceIDsFromVA_APIMediaAdapterINTEL} */
	@JavadocExclude
	public static int nclGetDeviceIDsFromVA_APIMediaAdapterINTEL(long platform, int media_adapter_type, long media_adapter, int media_adapter_set, int num_entries, long devices, long num_devices) {
		long __functionAddress = getInstance().GetDeviceIDsFromVA_APIMediaAdapterINTEL;
		if ( CHECKS ) {
			checkPointer(platform);
			checkPointer(media_adapter);
		}
		return callPIPIIPPI(__functionAddress, platform, media_adapter_type, media_adapter, media_adapter_set, num_entries, devices, num_devices);
	}

	/**
	 * Queries the OpenCL devices corresponding to a VA API display.
	 *
	 * @param platform           the platform ID returned by {@link CL10#clGetPlatformIDs GetPlatformIDs}
	 * @param media_adapter_type the type of {@code media_adapter}. Must be:<br>{@link #CL_VA_API_DISPLAY_INTEL VA_API_DISPLAY_INTEL}
	 * @param media_adapter      the media adapter whose corresponding OpenCL devices are being queried
	 * @param media_adapter_set  one of:<br>{@link #CL_PREFERRED_DEVICES_FOR_VA_API_INTEL PREFERRED_DEVICES_FOR_VA_API_INTEL}, {@link #CL_ALL_DEVICES_FOR_VA_API_INTEL ALL_DEVICES_FOR_VA_API_INTEL}
	 * @param num_entries        the number of cl_device_id entries that can be added to {@code devices}. If {@code devices} is not {@code NULL} then {@code num_entries} must be greater
	 *                           than zero.
	 * @param devices            returns a list of OpenCL devices found. The {@code cl_device_id} values returned in {@code devices} can be used to identify a specific OpenCL
	 *                           device. If {@code devices} is {@code NULL}, this argument is ignored. The number of OpenCL devices returned is the minimum of the value specified by
	 *                           {@code num_entries} and the number of OpenCL devices corresponding to {@code media_adapter}.
	 * @param num_devices        returns the number of OpenCL devices available that correspond to {@code media_adapter}. If {@code num_devices} is {@code NULL}, this argument is ignored.
	 */
	public static int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(long platform, int media_adapter_type, long media_adapter, int media_adapter_set, int num_entries, ByteBuffer devices, ByteBuffer num_devices) {
		if ( CHECKS ) {
			if ( devices != null ) checkBuffer(devices, num_entries << POINTER_SHIFT);
			if ( num_devices != null ) checkBuffer(num_devices, 1 << 2);
		}
		return nclGetDeviceIDsFromVA_APIMediaAdapterINTEL(platform, media_adapter_type, media_adapter, media_adapter_set, num_entries, memAddressSafe(devices), memAddressSafe(num_devices));
	}

	/** Alternative version of: {@link #clGetDeviceIDsFromVA_APIMediaAdapterINTEL GetDeviceIDsFromVA_APIMediaAdapterINTEL} */
	public static int clGetDeviceIDsFromVA_APIMediaAdapterINTEL(long platform, int media_adapter_type, long media_adapter, int media_adapter_set, PointerBuffer devices, IntBuffer num_devices) {
		if ( CHECKS )
			if ( num_devices != null ) checkBuffer(num_devices, 1);
		return nclGetDeviceIDsFromVA_APIMediaAdapterINTEL(platform, media_adapter_type, media_adapter, media_adapter_set, devices == null ? 0 : devices.remaining(), memAddressSafe(devices), memAddressSafe(num_devices));
	}

	// --- [ clCreateFromVA_APIMediaSurfaceINTEL ] ---

	/** Unsafe version of {@link #clCreateFromVA_APIMediaSurfaceINTEL CreateFromVA_APIMediaSurfaceINTEL} */
	@JavadocExclude
	public static long nclCreateFromVA_APIMediaSurfaceINTEL(long context, long flags, long surface, int plane, long errcode_ret) {
		long __functionAddress = getInstance().CreateFromVA_APIMediaSurfaceINTEL;
		if ( CHECKS )
			checkPointer(context);
		return callPJPIPP(__functionAddress, context, flags, surface, plane, errcode_ret);
	}

	/**
	 * Creates an OpenCL 2D image object from a VA API media surface or a plane of a VA API media surface.
	 *
	 * @param context     a valid OpenCL context created from a VA API display
	 * @param flags       a bit-field that is used to specify usage information. One of:<br>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}
	 * @param surface     a pointer to the VA API surface to share
	 * @param plane       the plane of {@code surface} to share, for planar formats. For non-planar formats, {@code plane} must be 0.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 */
	public static long clCreateFromVA_APIMediaSurfaceINTEL(long context, long flags, ByteBuffer surface, int plane, ByteBuffer errcode_ret) {
		if ( CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		return nclCreateFromVA_APIMediaSurfaceINTEL(context, flags, memAddress(surface), plane, memAddressSafe(errcode_ret));
	}

	/** Alternative version of: {@link #clCreateFromVA_APIMediaSurfaceINTEL CreateFromVA_APIMediaSurfaceINTEL} */
	public static long clCreateFromVA_APIMediaSurfaceINTEL(long context, long flags, IntBuffer surface, int plane, IntBuffer errcode_ret) {
		if ( CHECKS )
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		return nclCreateFromVA_APIMediaSurfaceINTEL(context, flags, memAddress(surface), plane, memAddressSafe(errcode_ret));
	}

	// --- [ clEnqueueAcquireVA_APIMediaSurfacesINTEL ] ---

	/** Unsafe version of {@link #clEnqueueAcquireVA_APIMediaSurfacesINTEL EnqueueAcquireVA_APIMediaSurfacesINTEL} */
	@JavadocExclude
	public static int nclEnqueueAcquireVA_APIMediaSurfacesINTEL(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueAcquireVA_APIMediaSurfacesINTEL;
		if ( CHECKS )
			checkPointer(command_queue);
		return callPIPIPPI(__functionAddress, command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event);
	}

	/**
	 * Acquires OpenCL memory objects that have been created from VA API surfaces. The VA API surfaces are acquired by the OpenCL context associated with
	 * {@code command_queue} and can therefore be used by all command- queues associated with the OpenCL context.
	 * 
	 * <p>OpenCL memory objects created from VA API surfaces must be acquired before they can be used by any OpenCL commands queued to a command-queue. If an
	 * OpenCL memory object created from a VA API surface is used while it is not acquired by OpenCL, the call attempting to use that OpenCL memory object
	 * will return {@link #CL_VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL VA_API_MEDIA_SURFACE_NOT_ACQUIRED_INTEL}.</p>
	 * 
	 * <p>If {@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC} is not specified as {@link CL10#CL_TRUE TRUE} during context creation, {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL} provides the
	 * synchronization guarantee that any VA API calls made before {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL} is called will complete executing before
	 * {@code event} reports completion and before the execution of any subsequent OpenCL work issued in {@code command_queue} begins. If the context was
	 * created with properties specifying {@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC} as {@link CL10#CL_TRUE TRUE}, the user is responsible for guaranteeing that any VA API calls
	 * involving the interop device(s) used in the OpenCL context made before {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL} is called have completed before
	 * calling {@code clEnqueueAcquireVA_APIMediaSurfacesINTEL}.</p>
	 *
	 * @param command_queue           a valid command-queue
	 * @param num_objects             the number of memory objects to be acquired in {@code mem_objects}.
	 * @param mem_objects             a pointer to a list of OpenCL memory objects that were created from VA API surfaces
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 */
	public static int clEnqueueAcquireVA_APIMediaSurfacesINTEL(long command_queue, int num_objects, ByteBuffer mem_objects, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( CHECKS ) {
			checkBuffer(mem_objects, num_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueAcquireVA_APIMediaSurfacesINTEL(command_queue, num_objects, memAddress(mem_objects), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueAcquireVA_APIMediaSurfacesINTEL EnqueueAcquireVA_APIMediaSurfacesINTEL} */
	public static int clEnqueueAcquireVA_APIMediaSurfacesINTEL(long command_queue, PointerBuffer mem_objects, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueAcquireVA_APIMediaSurfacesINTEL(command_queue, mem_objects.remaining(), memAddress(mem_objects), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	// --- [ clEnqueueReleaseVA_APIMediaSurfacesINTEL ] ---

	/** Unsafe version of {@link #clEnqueueReleaseVA_APIMediaSurfacesINTEL EnqueueReleaseVA_APIMediaSurfacesINTEL} */
	@JavadocExclude
	public static int nclEnqueueReleaseVA_APIMediaSurfacesINTEL(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event) {
		long __functionAddress = getInstance().EnqueueReleaseVA_APIMediaSurfacesINTEL;
		if ( CHECKS )
			checkPointer(command_queue);
		return callPIPIPPI(__functionAddress, command_queue, num_objects, mem_objects, num_events_in_wait_list, event_wait_list, event);
	}

	/**
	 * Releases OpenCL memory objects that have been created from VA API surfaces. The VA API surfaces are released by the OpenCL context associated with
	 * {@code command_queue}.
	 * 
	 * <p>OpenCL memory objects created from VA API surfaces which have been acquired by OpenCL must be released by OpenCL before they may be accessed by VA API.
	 * Accessing a VA API surface while its corresponding OpenCL memory object is acquired is in error and will result in undefined behavior, including but
	 * not limited to possible OpenCL errors, data corruption, and program termination.</p>
	 * 
	 * <p>If {@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC} is not specified as {@link CL10#CL_TRUE TRUE} during context creation, {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} provides the
	 * synchronization guarantee that any VA API calls made after {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} is called will not start executing until
	 * after all events in {@code event_wait_list} are complete and all work already submitted to {@code command_queue} completes execution. If the context
	 * was created with properties specifying {@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC} specified as {@link CL10#CL_TRUE TRUE}, the user is responsible for guaranteeing that any VA API
	 * calls involving the interop device(s) used in the OpenCL context made after {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} is called will not start
	 * executing until after the event returned by {@code clEnqueueReleaseVA_APIMediaSurfacesINTEL} reports completion.</p>
	 *
	 * @param command_queue           a valid OpenCL context created from a VA API display
	 * @param num_objects             the number of memory objects to be released in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of OpenCL memory objects that were created from VA API surfaces
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 */
	public static int clEnqueueReleaseVA_APIMediaSurfacesINTEL(long command_queue, int num_objects, ByteBuffer mem_objects, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		if ( CHECKS ) {
			checkBuffer(mem_objects, num_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueReleaseVA_APIMediaSurfacesINTEL(command_queue, num_objects, memAddress(mem_objects), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event));
	}

	/** Alternative version of: {@link #clEnqueueReleaseVA_APIMediaSurfacesINTEL EnqueueReleaseVA_APIMediaSurfacesINTEL} */
	public static int clEnqueueReleaseVA_APIMediaSurfacesINTEL(long command_queue, PointerBuffer mem_objects, PointerBuffer event_wait_list, PointerBuffer event) {
		if ( CHECKS )
			if ( event != null ) checkBuffer(event, 1);
		return nclEnqueueReleaseVA_APIMediaSurfacesINTEL(command_queue, mem_objects.remaining(), memAddress(mem_objects), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event));
	}

}