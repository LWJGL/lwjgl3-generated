/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**  */
public class VRTrackedCamera {

	protected VRTrackedCamera() {
		throw new UnsupportedOperationException();
	}

	// --- [ VRTrackedCamera_GetCameraErrorNameFromEnum ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetCameraErrorNameFromEnum GetCameraErrorNameFromEnum} */
	public static long nVRTrackedCamera_GetCameraErrorNameFromEnum(int eCameraError) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetCameraErrorNameFromEnum;
		if ( CHECKS )
			check(__functionAddress);
		return callP(__functionAddress, eCameraError);
	}

	/**
	 * Returns a string for an error.
	 *
	 * @param eCameraError one of:<br><table><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_None}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_OperationFailed}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidHandle}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameHeaderVersion}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_OutOfHandles}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_IPCFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_NotSupportedForThisDevice}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_SharedMemoryFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_FrameBufferingFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_StreamSetupFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidGLTextureId}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidSharedTextureHandle}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_FailedToGetGLTextureId}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_SharedTextureFailure}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidArgument}</td></tr><tr><td>{@link VR#EVRTrackedCameraError_VRTrackedCameraError_InvalidFrameBufferSize}</td></tr></table>
	 */
	public static String VRTrackedCamera_GetCameraErrorNameFromEnum(int eCameraError) {
		long __result = nVRTrackedCamera_GetCameraErrorNameFromEnum(eCameraError);
		return memASCII(__result);
	}

	// --- [ VRTrackedCamera_HasCamera ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_HasCamera HasCamera} */
	public static int nVRTrackedCamera_HasCamera(int nDeviceIndex, long pHasCamera) {
		long __functionAddress = OpenVR.VRTrackedCamera.HasCamera;
		if ( CHECKS )
			check(__functionAddress);
		return callPI(__functionAddress, nDeviceIndex, pHasCamera);
	}

	/**
	 * For convenience, same as tracked property request {@link VR#ETrackedDeviceProperty_Prop_HasCamera_Bool}.
	 *
	 * @param nDeviceIndex 
	 * @param pHasCamera   
	 */
	public static int VRTrackedCamera_HasCamera(int nDeviceIndex, ByteBuffer pHasCamera) {
		if ( CHECKS )
			check(pHasCamera, 1);
		return nVRTrackedCamera_HasCamera(nDeviceIndex, memAddress(pHasCamera));
	}

	// --- [ VRTrackedCamera_GetCameraFrameSize ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetCameraFrameSize GetCameraFrameSize} */
	public static int nVRTrackedCamera_GetCameraFrameSize(int nDeviceIndex, int eFrameType, long pnWidth, long pnHeight, long pnFrameBufferSize) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetCameraFrameSize;
		if ( CHECKS )
			check(__functionAddress);
		return callPPPI(__functionAddress, nDeviceIndex, eFrameType, pnWidth, pnHeight, pnFrameBufferSize);
	}

	/**
	 * Gets size of the image frame.
	 *
	 * @param nDeviceIndex      
	 * @param eFrameType        one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param pnWidth           
	 * @param pnHeight          
	 * @param pnFrameBufferSize 
	 */
	public static int VRTrackedCamera_GetCameraFrameSize(int nDeviceIndex, int eFrameType, IntBuffer pnWidth, IntBuffer pnHeight, IntBuffer pnFrameBufferSize) {
		if ( CHECKS ) {
			check(pnWidth, 1);
			check(pnHeight, 1);
			check(pnFrameBufferSize, 1);
		}
		return nVRTrackedCamera_GetCameraFrameSize(nDeviceIndex, eFrameType, memAddress(pnWidth), memAddress(pnHeight), memAddress(pnFrameBufferSize));
	}

	// --- [ VRTrackedCamera_GetCameraIntrinsics ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetCameraIntrinsics GetCameraIntrinsics} */
	public static int nVRTrackedCamera_GetCameraIntrinsics(int nDeviceIndex, int eFrameType, long pFocalLength, long pCenter) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetCameraIntrinsics;
		if ( CHECKS )
			check(__functionAddress);
		return callPPI(__functionAddress, nDeviceIndex, eFrameType, pFocalLength, pCenter);
	}

	/**
	 * 
	 *
	 * @param nDeviceIndex 
	 * @param eFrameType   one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param pFocalLength 
	 * @param pCenter      
	 */
	public static int VRTrackedCamera_GetCameraIntrinsics(int nDeviceIndex, int eFrameType, HmdVector2.Buffer pFocalLength, HmdVector2.Buffer pCenter) {
		if ( CHECKS ) {
			check(pFocalLength, 1);
			check(pCenter, 1);
		}
		return nVRTrackedCamera_GetCameraIntrinsics(nDeviceIndex, eFrameType, pFocalLength.address(), pCenter.address());
	}

	// --- [ VRTrackedCamera_GetCameraProjection ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetCameraProjection GetCameraProjection} */
	public static int nVRTrackedCamera_GetCameraProjection(int nDeviceIndex, int eFrameType, float flZNear, float flZFar, long pProjection) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetCameraProjection;
		if ( CHECKS )
			check(__functionAddress);
		return callPI(__functionAddress, nDeviceIndex, eFrameType, flZNear, flZFar, pProjection);
	}

	/**
	 * 
	 *
	 * @param nDeviceIndex 
	 * @param eFrameType   one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param flZNear      
	 * @param flZFar       
	 * @param pProjection  
	 */
	public static int VRTrackedCamera_GetCameraProjection(int nDeviceIndex, int eFrameType, float flZNear, float flZFar, HmdMatrix44 pProjection) {
		return nVRTrackedCamera_GetCameraProjection(nDeviceIndex, eFrameType, flZNear, flZFar, pProjection.address());
	}

	// --- [ VRTrackedCamera_AcquireVideoStreamingService ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_AcquireVideoStreamingService AcquireVideoStreamingService} */
	public static int nVRTrackedCamera_AcquireVideoStreamingService(int nDeviceIndex, long pHandle) {
		long __functionAddress = OpenVR.VRTrackedCamera.AcquireVideoStreamingService;
		if ( CHECKS )
			check(__functionAddress);
		return callPI(__functionAddress, nDeviceIndex, pHandle);
	}

	/**
	 * Acquiring streaming service permits video streaming for the caller. Releasing hints the system that video services do not need to be maintained for
	 * this client. If the camera has not already been activated, a one time spin up may incur some auto exposure as well as initial streaming frame delays.
	 * The camera should be considered a global resource accessible for shared consumption but not exclusive to any caller. The camera may go inactive due to
	 * lack of active consumers or headset idleness.
	 *
	 * @param nDeviceIndex 
	 * @param pHandle      
	 */
	public static int VRTrackedCamera_AcquireVideoStreamingService(int nDeviceIndex, LongBuffer pHandle) {
		if ( CHECKS )
			check(pHandle, 1);
		return nVRTrackedCamera_AcquireVideoStreamingService(nDeviceIndex, memAddress(pHandle));
	}

	// --- [ VRTrackedCamera_ReleaseVideoStreamingService ] ---

	public static int VRTrackedCamera_ReleaseVideoStreamingService(long hTrackedCamera) {
		long __functionAddress = OpenVR.VRTrackedCamera.ReleaseVideoStreamingService;
		if ( CHECKS )
			check(__functionAddress);
		return callJI(__functionAddress, hTrackedCamera);
	}

	// --- [ VRTrackedCamera_GetVideoStreamFrameBuffer ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamFrameBuffer GetVideoStreamFrameBuffer} */
	public static int nVRTrackedCamera_GetVideoStreamFrameBuffer(long hTrackedCamera, int eFrameType, long pFrameBuffer, int nFrameBufferSize, long pFrameHeader, int nFrameHeaderSize) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamFrameBuffer;
		if ( CHECKS )
			check(__functionAddress);
		return callJPPI(__functionAddress, hTrackedCamera, eFrameType, pFrameBuffer, nFrameBufferSize, pFrameHeader, nFrameHeaderSize);
	}

	/**
	 * Copies the image frame into a caller's provided buffer. The image data is currently provided as RGBA data, 4 bytes per pixel. A caller can provide null
	 * for the framebuffer or frameheader if not desired. Requesting the frame header first, followed by the frame buffer allows the caller to determine if
	 * the frame as advanced per the frame header sequence. If there is no frame available yet, due to initial camera spinup or re-activation, the error will
	 * be {@link VR#EVRTrackedCameraError_VRTrackedCameraError_NoFrameAvailable}. Ideally a caller should be polling at ~16ms intervals.
	 *
	 * @param hTrackedCamera 
	 * @param eFrameType     one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param pFrameBuffer   
	 * @param pFrameHeader   
	 */
	public static int VRTrackedCamera_GetVideoStreamFrameBuffer(long hTrackedCamera, int eFrameType, ByteBuffer pFrameBuffer, CameraVideoStreamFrameHeader pFrameHeader) {
		return nVRTrackedCamera_GetVideoStreamFrameBuffer(hTrackedCamera, eFrameType, memAddress(pFrameBuffer), pFrameBuffer.remaining(), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
	}

	// --- [ VRTrackedCamera_GetVideoStreamTextureSize ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamTextureSize GetVideoStreamTextureSize} */
	public static int nVRTrackedCamera_GetVideoStreamTextureSize(int nDeviceIndex, int eFrameType, long pTextureBounds, long pnWidth, long pnHeight) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureSize;
		if ( CHECKS )
			check(__functionAddress);
		return callPPPI(__functionAddress, nDeviceIndex, eFrameType, pTextureBounds, pnWidth, pnHeight);
	}

	/**
	 * Gets size of the image frame.
	 *
	 * @param nDeviceIndex   
	 * @param eFrameType     one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param pTextureBounds 
	 * @param pnWidth        
	 * @param pnHeight       
	 */
	public static int VRTrackedCamera_GetVideoStreamTextureSize(int nDeviceIndex, int eFrameType, VRTextureBounds pTextureBounds, IntBuffer pnWidth, IntBuffer pnHeight) {
		if ( CHECKS ) {
			check(pnWidth, 1);
			check(pnHeight, 1);
		}
		return nVRTrackedCamera_GetVideoStreamTextureSize(nDeviceIndex, eFrameType, pTextureBounds.address(), memAddress(pnWidth), memAddress(pnHeight));
	}

	// --- [ VRTrackedCamera_GetVideoStreamTextureD3D11 ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamTextureD3D11 GetVideoStreamTextureD3D11} */
	public static int nVRTrackedCamera_GetVideoStreamTextureD3D11(long hTrackedCamera, int eFrameType, long pD3D11DeviceOrResource, long ppD3D11ShaderResourceView, long pFrameHeader, int nFrameHeaderSize) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureD3D11;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pD3D11DeviceOrResource);
		}
		return callJPPPI(__functionAddress, hTrackedCamera, eFrameType, pD3D11DeviceOrResource, ppD3D11ShaderResourceView, pFrameHeader, nFrameHeaderSize);
	}

	/**
	 * Access a shared D3D11 texture for the specified tracked camera stream.
	 * 
	 * <p>The camera frame type {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted} is not supported directly as a shared texture. It is an interior
	 * subregion of the shared texture {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}. Instead, use {@link #VRTrackedCamera_GetVideoStreamTextureSize GetVideoStreamTextureSize} with
	 * {@code VRTrackedCameraFrameType_Undistorted} to determine the proper interior subregion bounds along with
	 * {@code GetVideoStreamTextureD3D11()} with {@code VRTrackedCameraFrameType_MaximumUndistorted} to provide the texture. The
	 * {@code VRTrackedCameraFrameType_MaximumUndistorted} will yield an image where the invalid regions are decoded by the alpha channel having a zero
	 * component. The valid regions all have a non-zero alpha component. The subregion as described by {@code VRTrackedCameraFrameType_Undistorted} guarantees
	 * a rectangle where all pixels are valid.</p>
	 *
	 * @param hTrackedCamera            
	 * @param eFrameType                one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param pD3D11DeviceOrResource    
	 * @param ppD3D11ShaderResourceView 
	 * @param pFrameHeader              
	 * @param nFrameHeaderSize          
	 */
	public static int VRTrackedCamera_GetVideoStreamTextureD3D11(long hTrackedCamera, int eFrameType, long pD3D11DeviceOrResource, PointerBuffer ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader pFrameHeader, int nFrameHeaderSize) {
		if ( CHECKS )
			check(ppD3D11ShaderResourceView, 1);
		return nVRTrackedCamera_GetVideoStreamTextureD3D11(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView), pFrameHeader.address(), nFrameHeaderSize);
	}

	/**
	 * Access a shared D3D11 texture for the specified tracked camera stream.
	 * 
	 * <p>The camera frame type {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted} is not supported directly as a shared texture. It is an interior
	 * subregion of the shared texture {@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}. Instead, use {@link #VRTrackedCamera_GetVideoStreamTextureSize GetVideoStreamTextureSize} with
	 * {@code VRTrackedCameraFrameType_Undistorted} to determine the proper interior subregion bounds along with
	 * {@code GetVideoStreamTextureD3D11()} with {@code VRTrackedCameraFrameType_MaximumUndistorted} to provide the texture. The
	 * {@code VRTrackedCameraFrameType_MaximumUndistorted} will yield an image where the invalid regions are decoded by the alpha channel having a zero
	 * component. The valid regions all have a non-zero alpha component. The subregion as described by {@code VRTrackedCameraFrameType_Undistorted} guarantees
	 * a rectangle where all pixels are valid.</p>
	 *
	 * @param hTrackedCamera            
	 * @param eFrameType                one of:<br><table><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Distorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_Undistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_VRTrackedCameraFrameType_MaximumUndistorted}</td></tr><tr><td>{@link VR#EVRTrackedCameraFrameType_MAX_CAMERA_FRAME_TYPES}</td></tr></table>
	 * @param pD3D11DeviceOrResource    
	 * @param ppD3D11ShaderResourceView 
	 * @param pFrameHeader              
	 */
	public static int VRTrackedCamera_GetVideoStreamTextureD3D11(long hTrackedCamera, int eFrameType, long pD3D11DeviceOrResource, PointerBuffer ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader pFrameHeader) {
		if ( CHECKS )
			check(ppD3D11ShaderResourceView, 1);
		return nVRTrackedCamera_GetVideoStreamTextureD3D11(hTrackedCamera, eFrameType, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
	}

	// --- [ VRTrackedCamera_GetVideoStreamTextureGL ] ---

	/** Unsafe version of: {@link #VRTrackedCamera_GetVideoStreamTextureGL GetVideoStreamTextureGL} */
	public static int nVRTrackedCamera_GetVideoStreamTextureGL(long hTrackedCamera, int eFrameType, long pglTextureId, long pFrameHeader, int nFrameHeaderSize) {
		long __functionAddress = OpenVR.VRTrackedCamera.GetVideoStreamTextureGL;
		if ( CHECKS )
			check(__functionAddress);
		return callJPPI(__functionAddress, hTrackedCamera, eFrameType, pglTextureId, pFrameHeader, nFrameHeaderSize);
	}

	/**
	 * Access a shared GL texture for the specified tracked camera stream.
	 *
	 * @param hTrackedCamera   
	 * @param eFrameType       
	 * @param pglTextureId     
	 * @param pFrameHeader     
	 * @param nFrameHeaderSize 
	 */
	public static int VRTrackedCamera_GetVideoStreamTextureGL(long hTrackedCamera, int eFrameType, IntBuffer pglTextureId, CameraVideoStreamFrameHeader pFrameHeader, int nFrameHeaderSize) {
		if ( CHECKS )
			check(pglTextureId, 1);
		return nVRTrackedCamera_GetVideoStreamTextureGL(hTrackedCamera, eFrameType, memAddress(pglTextureId), pFrameHeader.address(), nFrameHeaderSize);
	}

	/**
	 * Access a shared GL texture for the specified tracked camera stream.
	 *
	 * @param hTrackedCamera 
	 * @param eFrameType     
	 * @param pglTextureId   
	 * @param pFrameHeader   
	 */
	public static int VRTrackedCamera_GetVideoStreamTextureGL(long hTrackedCamera, int eFrameType, IntBuffer pglTextureId, CameraVideoStreamFrameHeader pFrameHeader) {
		if ( CHECKS )
			check(pglTextureId, 1);
		return nVRTrackedCamera_GetVideoStreamTextureGL(hTrackedCamera, eFrameType, memAddress(pglTextureId), pFrameHeader.address(), CameraVideoStreamFrameHeader.SIZEOF);
	}

	// --- [ VRTrackedCamera_ReleaseVideoStreamTextureGL ] ---

	public static int VRTrackedCamera_ReleaseVideoStreamTextureGL(long hTrackedCamera, int glTextureId) {
		long __functionAddress = OpenVR.VRTrackedCamera.ReleaseVideoStreamTextureGL;
		if ( CHECKS )
			check(__functionAddress);
		return callJI(__functionAddress, hTrackedCamera, glTextureId);
	}

}