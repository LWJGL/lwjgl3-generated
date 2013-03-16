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
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenCL 1.1 functionality. */
public final class CL11 {

	/** Error Codes. */
	public static final int
		CL_MISALIGNED_SUB_BUFFER_OFFSET              = 0xFFFFFFF3,
		CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST = 0xFFFFFFF2,
		CL_INVALID_PROPERTY                          = 0xFFFFFFC0;

	/** OpenCL Version. */
	public static final int
		CL_VERSION_1_1 = 0x1;

	/** cl_device_info. */
	public static final int
		CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF = 0x1034,
		CL_DEVICE_HOST_UNIFIED_MEMORY         = 0x1035,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR    = 0x1036,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT   = 0x1037,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_INT     = 0x1038,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG    = 0x1039,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT   = 0x103A,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE  = 0x103B,
		CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF    = 0x103C,
		CL_DEVICE_OPENCL_C_VERSION            = 0x103D;

	/** cl_device_fp_config - bitfield. */
	public static final int
		CL_FP_SOFT_FLOAT = 1 << 6;

	/** cl_context_info. */
	public static final int
		CL_CONTEXT_NUM_DEVICES = 0x1083;

	/** cl_channel_order. */
	public static final int
		CL_Rx   = 0x10BA,
		CL_RGx  = 0x10BB,
		CL_RGBx = 0x10BC;

	/** cl_mem_info. */
	public static final int
		CL_MEM_ASSOCIATED_MEMOBJECT = 0x1107,
		CL_MEM_OFFSET               = 0x1108;

	/** cl_addressing_mode. */
	public static final int
		CL_ADDRESS_MIRRORED_REPEAT = 0x1134;

	/** cl_kernel_work_group_info. */
	public static final int
		CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 0x11B3,
		CL_KERNEL_PRIVATE_MEM_SIZE                   = 0x11B4;

	/** cl_event_info. */
	public static final int
		CL_EVENT_CONTEXT = 0x11D4;

	/** cl_command_type. */
	public static final int
		CL_COMMAND_READ_BUFFER_RECT  = 0x1201,
		CL_COMMAND_WRITE_BUFFER_RECT = 0x1202,
		CL_COMMAND_COPY_BUFFER_RECT  = 0x1203,
		CL_COMMAND_USER              = 0x1204;

	/** cl_buffer_create_type. */
	public static final int
		CL_BUFFER_CREATE_TYPE_REGION = 0x1220;

	private CL11() {}

	// --- [ clCreateSubBuffer ] ---

	/** JNI method for {@link #clCreateSubBuffer(CLMem, long, int, ByteBuffer, ByteBuffer)} */
	public static native long nclCreateSubBuffer(long buffer, long flags, int buffer_create_type, long buffer_create_info, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param buffer             
	 * @param flags              
	 * @param buffer_create_type 
	 * @param buffer_create_info 
	 * @param errcode_ret        
	 */
	public static CLMem clCreateSubBuffer(CLMem buffer, long flags, int buffer_create_type, ByteBuffer buffer_create_info, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(buffer).clCreateSubBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_create_info, cl_buffer_region.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLMem(nclCreateSubBuffer(buffer.getPointer(), flags, buffer_create_type, memAddress(buffer_create_info), memAddressSafe(errcode_ret), __functionAddress), buffer);
	}

	/** Alternative version of: {@link #clCreateSubBuffer(CLMem, long, int, ByteBuffer, ByteBuffer)} */
	public static CLMem clCreateSubBuffer(CLMem buffer, long flags, int buffer_create_type, ByteBuffer buffer_create_info, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(buffer).clCreateSubBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_create_info, cl_buffer_region.SIZEOF);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLMem(nclCreateSubBuffer(buffer.getPointer(), flags, buffer_create_type, memAddress(buffer_create_info), memAddressSafe(errcode_ret), __functionAddress), buffer);
	}

	// --- [ clSetMemObjectDestructorCallback ] ---

	/** JNI method for {@link #clSetMemObjectDestructorCallback(CLMem, CLMemObjectDestructorCallback, ByteBuffer)} */
	public static native int nclSetMemObjectDestructorCallback(long memobj, long pfn_notify, long user_data, long __functionAddress);

	/**
	 * 
	 *
	 * @param memobj     
	 * @param pfn_notify 
	 * @param user_data  
	 */
	public static int clSetMemObjectDestructorCallback(CLMem memobj, CLMemObjectDestructorCallback pfn_notify, ByteBuffer user_data) {
		long __functionAddress = getInstance(memobj).clSetMemObjectDestructorCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetMemObjectDestructorCallback(memobj.getPointer(), CLMemObjectDestructorCallback.CALLBACK, memAddress(user_data), __functionAddress);
	}

	// --- [ clEnqueueReadBufferRect ] ---

	/** JNI method for {@link #clEnqueueReadBufferRect(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, ByteBuffer, long, long, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueReadBufferRect(long command_queue, long buffer, int blocking_read, long buffer_offset, long host_offset, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param buffer                  
	 * @param blocking_read           
	 * @param buffer_offset           
	 * @param host_offset             
	 * @param region                  
	 * @param buffer_row_pitch        
	 * @param buffer_slice_pitch      
	 * @param host_row_pitch          
	 * @param host_slice_pitch        
	 * @param ptr                     
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, ByteBuffer buffer_offset, ByteBuffer host_offset, ByteBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(host_offset, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReadBufferRect(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, ByteBuffer, long, long, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueReadBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_read, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueReadBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReadBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_read, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueWriteBufferRect ] ---

	/** JNI method for {@link #clEnqueueWriteBufferRect(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, ByteBuffer, long, long, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueWriteBufferRect(long command_queue, long buffer, int blocking_write, long buffer_offset, long host_offset, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param buffer                  
	 * @param blocking_write          
	 * @param buffer_offset           
	 * @param host_offset             
	 * @param region                  
	 * @param buffer_row_pitch        
	 * @param buffer_slice_pitch      
	 * @param host_row_pitch          
	 * @param host_slice_pitch        
	 * @param ptr                     
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, ByteBuffer buffer_offset, ByteBuffer host_offset, ByteBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(host_offset, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueWriteBufferRect(CLCommandQueue, CLMem, int, ByteBuffer, ByteBuffer, ByteBuffer, long, long, long, long, ByteBuffer, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueWriteBufferRect(CLCommandQueue command_queue, CLMem buffer, int blocking_write, PointerBuffer buffer_offset, PointerBuffer host_offset, PointerBuffer region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, ByteBuffer ptr, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueWriteBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(buffer_offset, 3);
			checkBuffer(host_offset, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueWriteBufferRect(command_queue.getPointer(), buffer.getPointer(), blocking_write, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueCopyBufferRect ] ---

	/** JNI method for {@link #clEnqueueCopyBufferRect(CLCommandQueue, CLMem, CLMem, ByteBuffer, ByteBuffer, ByteBuffer, long, long, long, long, int, ByteBuffer, ByteBuffer)} */
	public static native int nclEnqueueCopyBufferRect(long command_queue, long src_buffer, long dst_buffer, long src_origin, long dst_origin, long region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * 
	 *
	 * @param command_queue           
	 * @param src_buffer              
	 * @param dst_buffer              
	 * @param src_origin              
	 * @param dst_origin              
	 * @param region                  
	 * @param src_row_pitch           
	 * @param src_slice_pitch         
	 * @param dst_row_pitch           
	 * @param dst_slice_pitch         
	 * @param num_events_in_wait_list 
	 * @param event_wait_list         
	 * @param event                   
	 */
	public static int clEnqueueCopyBufferRect(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, ByteBuffer src_origin, ByteBuffer dst_origin, ByteBuffer region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(dst_origin, 3 << PointerBuffer.getPointerSizeShift());
			checkBuffer(region, 3 << PointerBuffer.getPointerSizeShift());
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << PointerBuffer.getPointerSizeShift());
			if ( event != null ) checkBuffer(event, 1 << PointerBuffer.getPointerSizeShift());
		}
		return nclEnqueueCopyBufferRect(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueCopyBufferRect(CLCommandQueue, CLMem, CLMem, ByteBuffer, ByteBuffer, ByteBuffer, long, long, long, long, int, ByteBuffer, ByteBuffer)} */
	public static int clEnqueueCopyBufferRect(CLCommandQueue command_queue, CLMem src_buffer, CLMem dst_buffer, PointerBuffer src_origin, PointerBuffer dst_origin, PointerBuffer region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).clEnqueueCopyBufferRect;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(src_origin, 3);
			checkBuffer(dst_origin, 3);
			checkBuffer(region, 3);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueCopyBufferRect(command_queue.getPointer(), src_buffer.getPointer(), dst_buffer.getPointer(), memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clCreateUserEvent ] ---

	/** JNI method for {@link #clCreateUserEvent(CLContext, ByteBuffer)} */
	public static native long nclCreateUserEvent(long context, long errcode_ret, long __functionAddress);

	/**
	 * 
	 *
	 * @param context     
	 * @param errcode_ret 
	 */
	public static CLEvent clCreateUserEvent(CLContext context, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateUserEvent;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return new CLEvent(nclCreateUserEvent(context.getPointer(), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateUserEvent(CLContext, ByteBuffer)} */
	public static CLEvent clCreateUserEvent(CLContext context, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateUserEvent;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return new CLEvent(nclCreateUserEvent(context.getPointer(), memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clSetUserEventStatus ] ---

	/** JNI method for {@link #clSetUserEventStatus(CLEvent, int)} */
	public static native int nclSetUserEventStatus(long event, int execution_status, long __functionAddress);

	/**
	 * 
	 *
	 * @param event            
	 * @param execution_status 
	 */
	public static int clSetUserEventStatus(CLEvent event, int execution_status) {
		long __functionAddress = getInstance(event).clSetUserEventStatus;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetUserEventStatus(event.getPointer(), execution_status, __functionAddress);
	}

	// --- [ clSetEventCallback ] ---

	/** JNI method for {@link #clSetEventCallback(CLEvent, int, CLEventCallback, ByteBuffer)} */
	public static native int nclSetEventCallback(long event, int command_exec_callback_type, long pfn_notify, long user_data, long __functionAddress);

	/**
	 * 
	 *
	 * @param event                      
	 * @param command_exec_callback_type 
	 * @param pfn_notify                 
	 * @param user_data                  
	 */
	public static int clSetEventCallback(CLEvent event, int command_exec_callback_type, CLEventCallback pfn_notify, ByteBuffer user_data) {
		long __functionAddress = getInstance(event).clSetEventCallback;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclSetEventCallback(event.getPointer(), command_exec_callback_type, CLEventCallback.CALLBACK, memAddress(user_data), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__CL11;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenCL11") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.clCreateSubBuffer != 0L &&
			funcs.clSetMemObjectDestructorCallback != 0L &&
			funcs.clEnqueueReadBufferRect != 0L &&
			funcs.clEnqueueWriteBufferRect != 0L &&
			funcs.clEnqueueCopyBufferRect != 0L &&
			funcs.clCreateUserEvent != 0L &&
			funcs.clSetUserEventStatus != 0L &&
			funcs.clSetEventCallback != 0L;

		return CL.checkExtension("OpenCL11", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code CL11}. */
	public static final class Functions implements FunctionMap {

		public final long
			clCreateSubBuffer,
			clSetMemObjectDestructorCallback,
			clEnqueueReadBufferRect,
			clEnqueueWriteBufferRect,
			clEnqueueCopyBufferRect,
			clCreateUserEvent,
			clSetUserEventStatus,
			clSetEventCallback;

		public Functions(FunctionProviderLocal provider) {
			clCreateSubBuffer = provider.getFunctionAddress("clCreateSubBuffer");
			clSetMemObjectDestructorCallback = provider.getFunctionAddress("clSetMemObjectDestructorCallback");
			clEnqueueReadBufferRect = provider.getFunctionAddress("clEnqueueReadBufferRect");
			clEnqueueWriteBufferRect = provider.getFunctionAddress("clEnqueueWriteBufferRect");
			clEnqueueCopyBufferRect = provider.getFunctionAddress("clEnqueueCopyBufferRect");
			clCreateUserEvent = provider.getFunctionAddress("clCreateUserEvent");
			clSetUserEventStatus = provider.getFunctionAddress("clSetUserEventStatus");
			clSetEventCallback = provider.getFunctionAddress("clSetEventCallback");
		}

	}

}