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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to CGL. */
public final class CGL {

	/** Attribute names for {@link #CGLChoosePixelFormat ChoosePixelFormat} and {@link #CGLDescribePixelFormat DescribePixelFormat}. */
	public static final int
		kCGLPFAAllRenderers                       = 0x1,
		kCGLPFATripleBuffer                       = 0x3,
		kCGLPFADoubleBuffer                       = 0x5,
		kCGLPFAStereo                             = 0x6,
		kCGLPFAColorSize                          = 0x8,
		kCGLPFAAlphaSize                          = 0xB,
		kCGLPFADepthSize                          = 0xC,
		kCGLPFAStencilSize                        = 0xD,
		kCGLPFAMinimumPolicy                      = 0x33,
		kCGLPFAMaximumPolicy                      = 0x34,
		kCGLPFASampleBuffers                      = 0x37,
		kCGLPFASamples                            = 0x38,
		kCGLPFAColorFloat                         = 0x3A,
		kCGLPFAMultisample                        = 0x3B,
		kCGLPFASupersample                        = 0x3C,
		kCGLPFASampleAlpha                        = 0x3D,
		kCGLPFARendererID                         = 0x46,
		kCGLPFASingleRenderer                     = 0x47,
		kCGLPFANoRecovery                         = 0x48,
		kCGLPFAAccelerated                        = 0x49,
		kCGLPFAClosestPolicy                      = 0x4A,
		kCGLPFABackingStore                       = 0x4C,
		kCGLPFABackingVolatile                    = 0x4D,
		kCGLPFADisplayMask                        = 0x54,
		kCGLPFAAllowOfflineRenderers              = 0x60,
		kCGLPFAAcceleratedCompute                 = 0x61,
		kCGLPFAOpenGLProfile                      = 0x63,
		kCGLPFASupportsAutomaticGraphicsSwitching = 0x65,
		kCGLPFAVirtualScreenCount                 = 0x80,
		kCGLPFAAuxBuffers                         = 0x7,
		kCGLPFAAccumSize                          = 0xE,
		kCGLPFAOffScreen                          = 0x35,
		kCGLPFAAuxDepthStencil                    = 0x39,
		kCGLPFAWindow                             = 0x50,
		kCGLPFACompliant                          = 0x53,
		kCGLPFAPBuffer                            = 0x5A,
		kCGLPFARemotePBuffer                      = 0x5B,
		kCGLPFARobust                             = 0x4B,
		kCGLPFAMPSafe                             = 0x4E,
		kCGLPFAMultiScreen                        = 0x51,
		kCGLPFAFullScreen                         = 0x36;

	/** Property names for {@link #CGLDescribeRenderer DescribeRenderer}. */
	public static final int
		kCGLRPOffScreen              = 0x35,
		kCGLRPRendererID             = 0x46,
		kCGLRPAccelerated            = 0x49,
		kCGLRPBackingStore           = 0x4C,
		kCGLRPWindow                 = 0x50,
		kCGLRPCompliant              = 0x53,
		kCGLRPDisplayMask            = 0x54,
		kCGLRPBufferModes            = 0x64,
		kCGLRPColorModes             = 0x67,
		kCGLRPAccumModes             = 0x68,
		kCGLRPDepthModes             = 0x69,
		kCGLRPStencilModes           = 0x6A,
		kCGLRPMaxAuxBuffers          = 0x6B,
		kCGLRPMaxSampleBuffers       = 0x6C,
		kCGLRPMaxSamples             = 0x6D,
		kCGLRPSampleModes            = 0x6E,
		kCGLRPSampleAlpha            = 0x6F,
		kCGLRPVideoMemory            = 0x78,
		kCGLRPTextureMemory          = 0x79,
		kCGLRPGPUVertProcCapable     = 0x7A,
		kCGLRPGPUFragProcCapable     = 0x7B,
		kCGLRPRendererCount          = 0x80,
		kCGLRPOnline                 = 0x81,
		kCGLRPAcceleratedCompute     = 0x82,
		kCGLRPVideoMemoryMegabytes   = 0x83,
		kCGLRPTextureMemoryMegabytes = 0x84,
		kCGLRPRobust                 = 0x4B,
		kCGLRPMPSafe                 = 0x4E,
		kCGLRPMultiScreen            = 0x51,
		kCGLRPFullScreen             = 0x36;

	/** Enable names for {@link #CGLEnable Enable}, {@link #CGLDisable Disable}, and {@link #CGLIsEnabled IsEnabled}. */
	public static final int
		kCGLCESwapRectangle           = 0xC9,
		kCGLCESwapLimit               = 0xCB,
		kCGLCERasterization           = 0xDD,
		kCGLCEStateValidation         = 0x12D,
		kCGLCESurfaceBackingSize      = 0x131,
		kCGLCEDisplayListOptimization = 0x133,
		kCGLCEMPEngine                = 0x139;

	/** Parameter names for {@link #CGLSetParameter SetParameter} and {@link #CGLGetParameter GetParameter}. */
	public static final int
		kCGLCPSwapRectangle          = 0xC8,
		kCGLCPSwapInterval           = 0xDE,
		kCGLCPDispatchTableSize      = 0xE0,
		kCGLCPClientStorage          = 0xE2,
		kCGLCPSurfaceTexture         = 0xE4,
		kCGLCPSurfaceOrder           = 0xEB,
		kCGLCPSurfaceOpacity         = 0xEC,
		kCGLCPSurfaceBackingSize     = 0x130,
		kCGLCPSurfaceSurfaceVolatile = 0x132,
		kCGLCPReclaimResources       = 0x134,
		kCGLCPCurrentRendererID      = 0x135,
		kCGLCPGPUVertexProcessing    = 0x136,
		kCGLCPGPUFragmentProcessing  = 0x137,
		kCGLCPHasDrawable            = 0x13A,
		kCGLCPMPSwapsInFlight        = 0x13B;

	/** Option names for {@link #CGLSetGlobalOption SetGlobalOption} and {@link #CGLGetGlobalOption GetGlobalOption}. */
	public static final int
		kCGLGOFormatCacheSize  = 0x1F5,
		kCGLGOClearFormatCache = 0x1F6,
		kCGLGORetainRenderers  = 0x1F7,
		kCGLGOResetLibrary     = 0x1F8,
		kCGLGOUseErrorHandler  = 0x1F9,
		kCGLGOUseBuildCache    = 0x1FA;

	/** OpenGL Implementation Profiles. */
	public static final int
		kCGLOGLPVersion_Legacy   = 0x1000,
		kCGLOGLPVersion_3_2_Core = 0x3200;

	/** CGL error return values. */
	public static final int
		kCGLNoError         = 0x0,
		kCGLBadAttribute    = 0x2710,
		kCGLBadProperty     = 0x2711,
		kCGLBadPixelFormat  = 0x2712,
		kCGLBadRendererInfo = 0x2713,
		kCGLBadContext      = 0x2714,
		kCGLBadDrawable     = 0x2715,
		kCGLBadDisplay      = 0x2716,
		kCGLBadState        = 0x2717,
		kCGLBadValue        = 0x2718,
		kCGLBadMatch        = 0x2719,
		kCGLBadEnumeration  = 0x271A,
		kCGLBadOffScreen    = 0x271B,
		kCGLBadFullScreen   = 0x271C,
		kCGLBadWindow       = 0x271D,
		kCGLBadAddress      = 0x271E,
		kCGLBadCodeModule   = 0x271F,
		kCGLBadAlloc        = 0x2720,
		kCGLBadConnection   = 0x2721;

	/** Buffer modes. */
	public static final int
		kCGLMonoscopicBit   = 0x1,
		kCGLStereoscopicBit = 0x2,
		kCGLSingleBufferBit = 0x4,
		kCGLDoubleBufferBit = 0x8,
		kCGLTripleBufferBit = 0x10;

	/** Depth and stencil buffer depths. */
	public static final int
		kCGL0Bit   = 0x1,
		kCGL1Bit   = 0x2,
		kCGL2Bit   = 0x4,
		kCGL3Bit   = 0x8,
		kCGL4Bit   = 0x10,
		kCGL5Bit   = 0x20,
		kCGL6Bit   = 0x40,
		kCGL8Bit   = 0x80,
		kCGL10Bit  = 0x100,
		kCGL12Bit  = 0x200,
		kCGL16Bit  = 0x400,
		kCGL24Bit  = 0x800,
		kCGL32Bit  = 0x1000,
		kCGL48Bit  = 0x2000,
		kCGL64Bit  = 0x4000,
		kCGL96Bit  = 0x8000,
		kCGL128Bit = 0x10000;

	/** Color and accumulation buffer formats. */
	public static final int
		kCGLRGB444Bit       = 0x40,
		kCGLARGB4444Bit     = 0x80,
		kCGLRGB444A8Bit     = 0x100,
		kCGLRGB555Bit       = 0x200,
		kCGLARGB1555Bit     = 0x400,
		kCGLRGB555A8Bit     = 0x800,
		kCGLRGB565Bit       = 0x1000,
		kCGLRGB565A8Bit     = 0x2000,
		kCGLRGB888Bit       = 0x4000,
		kCGLARGB8888Bit     = 0x8000,
		kCGLRGB888A8Bit     = 0x10000,
		kCGLRGB101010Bit    = 0x20000,
		kCGLARGB2101010Bit  = 0x40000,
		kCGLRGB101010_A8Bit = 0x80000,
		kCGLRGB121212Bit    = 0x100000,
		kCGLARGB12121212Bit = 0x200000,
		kCGLRGB161616Bit    = 0x400000,
		kCGLRGBA16161616Bit = 0x800000,
		kCGLRGBFloat64Bit   = 0x1000000,
		kCGLRGBAFloat64Bit  = 0x2000000,
		kCGLRGBFloat128Bit  = 0x4000000,
		kCGLRGBAFloat128Bit = 0x8000000,
		kCGLRGBFloat256Bit  = 0x10000000,
		kCGLRGBAFloat256Bit = 0x20000000;

	/** Sampling modes. */
	public static final int
		kCGLSupersampleBit = 0x1,
		kCGLMultisampleBit = 0x2;

	/** Function address. */
	@JavadocExclude
	public final long
		GetCurrentContext,
		SetCurrentContext,
		GetShareGroup,
		ChoosePixelFormat,
		DestroyPixelFormat,
		DescribePixelFormat,
		ReleasePixelFormat,
		RetainPixelFormat,
		GetPixelFormatRetainCount,
		QueryRendererInfo,
		DestroyRendererInfo,
		DescribeRenderer,
		CreateContext,
		DestroyContext,
		CopyContext,
		RetainContext,
		ReleaseContext,
		GetContextRetainCount,
		GetPixelFormat,
		CreatePBuffer,
		DestroyPBuffer,
		DescribePBuffer,
		TexImagePBuffer,
		RetainPBuffer,
		ReleasePBuffer,
		GetPBufferRetainCount,
		SetOffScreen,
		GetOffScreen,
		SetFullScreen,
		SetFullScreenOnDisplay,
		SetPBuffer,
		GetPBuffer,
		ClearDrawable,
		FlushDrawable,
		Enable,
		Disable,
		IsEnabled,
		SetParameter,
		GetParameter,
		SetVirtualScreen,
		GetVirtualScreen,
		UpdateContext,
		SetGlobalOption,
		GetGlobalOption,
		LockContext,
		UnlockContext,
		GetVersion,
		ErrorString;

	@JavadocExclude
	public CGL(FunctionProvider provider) {
		GetCurrentContext = provider.getFunctionAddress("CGLGetCurrentContext");
		SetCurrentContext = provider.getFunctionAddress("CGLSetCurrentContext");
		GetShareGroup = provider.getFunctionAddress("CGLGetShareGroup");
		ChoosePixelFormat = provider.getFunctionAddress("CGLChoosePixelFormat");
		DestroyPixelFormat = provider.getFunctionAddress("CGLDestroyPixelFormat");
		DescribePixelFormat = provider.getFunctionAddress("CGLDescribePixelFormat");
		ReleasePixelFormat = provider.getFunctionAddress("CGLReleasePixelFormat");
		RetainPixelFormat = provider.getFunctionAddress("CGLRetainPixelFormat");
		GetPixelFormatRetainCount = provider.getFunctionAddress("CGLGetPixelFormatRetainCount");
		QueryRendererInfo = provider.getFunctionAddress("CGLQueryRendererInfo");
		DestroyRendererInfo = provider.getFunctionAddress("CGLDestroyRendererInfo");
		DescribeRenderer = provider.getFunctionAddress("CGLDescribeRenderer");
		CreateContext = provider.getFunctionAddress("CGLCreateContext");
		DestroyContext = provider.getFunctionAddress("CGLDestroyContext");
		CopyContext = provider.getFunctionAddress("CGLCopyContext");
		RetainContext = provider.getFunctionAddress("CGLRetainContext");
		ReleaseContext = provider.getFunctionAddress("CGLReleaseContext");
		GetContextRetainCount = provider.getFunctionAddress("CGLGetContextRetainCount");
		GetPixelFormat = provider.getFunctionAddress("CGLGetPixelFormat");
		CreatePBuffer = provider.getFunctionAddress("CGLCreatePBuffer");
		DestroyPBuffer = provider.getFunctionAddress("CGLDestroyPBuffer");
		DescribePBuffer = provider.getFunctionAddress("CGLDescribePBuffer");
		TexImagePBuffer = provider.getFunctionAddress("CGLTexImagePBuffer");
		RetainPBuffer = provider.getFunctionAddress("CGLRetainPBuffer");
		ReleasePBuffer = provider.getFunctionAddress("CGLReleasePBuffer");
		GetPBufferRetainCount = provider.getFunctionAddress("CGLGetPBufferRetainCount");
		SetOffScreen = provider.getFunctionAddress("CGLSetOffScreen");
		GetOffScreen = provider.getFunctionAddress("CGLGetOffScreen");
		SetFullScreen = provider.getFunctionAddress("CGLSetFullScreen");
		SetFullScreenOnDisplay = provider.getFunctionAddress("CGLSetFullScreenOnDisplay");
		SetPBuffer = provider.getFunctionAddress("CGLSetPBuffer");
		GetPBuffer = provider.getFunctionAddress("CGLGetPBuffer");
		ClearDrawable = provider.getFunctionAddress("CGLClearDrawable");
		FlushDrawable = provider.getFunctionAddress("CGLFlushDrawable");
		Enable = provider.getFunctionAddress("CGLEnable");
		Disable = provider.getFunctionAddress("CGLDisable");
		IsEnabled = provider.getFunctionAddress("CGLIsEnabled");
		SetParameter = provider.getFunctionAddress("CGLSetParameter");
		GetParameter = provider.getFunctionAddress("CGLGetParameter");
		SetVirtualScreen = provider.getFunctionAddress("CGLSetVirtualScreen");
		GetVirtualScreen = provider.getFunctionAddress("CGLGetVirtualScreen");
		UpdateContext = provider.getFunctionAddress("CGLUpdateContext");
		SetGlobalOption = provider.getFunctionAddress("CGLSetGlobalOption");
		GetGlobalOption = provider.getFunctionAddress("CGLGetGlobalOption");
		LockContext = provider.getFunctionAddress("CGLLockContext");
		UnlockContext = provider.getFunctionAddress("CGLUnlockContext");
		GetVersion = provider.getFunctionAddress("CGLGetVersion");
		ErrorString = provider.getFunctionAddress("CGLErrorString");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link CGL} instance for the current context. */
	public static CGL getInstance() {
		return checkFunctionality(GL.getCapabilities().__CGL);
	}

	static CGL create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("CGL") ) return null;

		CGL funcs = new CGL(provider);

		boolean supported = checkFunctions(
			funcs.GetCurrentContext, funcs.SetCurrentContext, funcs.GetShareGroup, funcs.ChoosePixelFormat, funcs.DestroyPixelFormat, funcs.DescribePixelFormat, 
			funcs.ReleasePixelFormat, funcs.RetainPixelFormat, funcs.GetPixelFormatRetainCount, funcs.QueryRendererInfo, funcs.DestroyRendererInfo, 
			funcs.DescribeRenderer, funcs.CreateContext, funcs.DestroyContext, funcs.CopyContext, funcs.RetainContext, funcs.ReleaseContext, 
			funcs.GetContextRetainCount, funcs.GetPixelFormat, funcs.CreatePBuffer, funcs.DestroyPBuffer, funcs.DescribePBuffer, funcs.TexImagePBuffer, 
			funcs.RetainPBuffer, funcs.ReleasePBuffer, funcs.GetPBufferRetainCount, funcs.SetOffScreen, funcs.GetOffScreen, funcs.SetFullScreen, 
			funcs.SetFullScreenOnDisplay, funcs.SetPBuffer, funcs.GetPBuffer, funcs.ClearDrawable, funcs.FlushDrawable, funcs.Enable, funcs.Disable, 
			funcs.IsEnabled, funcs.SetParameter, funcs.GetParameter, funcs.SetVirtualScreen, funcs.GetVirtualScreen, funcs.UpdateContext, funcs.SetGlobalOption, 
			funcs.GetGlobalOption, funcs.LockContext, funcs.UnlockContext, funcs.GetVersion, funcs.ErrorString
		);

		return GL.checkExtension("CGL", funcs, supported);
	}

	// --- [ CGLGetCurrentContext ] ---

	/** Returns the current rendering context. If there is none, returns {@code NULL}. */
	public static long CGLGetCurrentContext() {
		long __functionAddress = getInstance().GetCurrentContext;
		return callP(__functionAddress);
	}

	// --- [ CGLSetCurrentContext ] ---

	/**
	 * Sets the specified rendering context as the current rendering context.
	 * 
	 * <p>There can be only one current rendering context. Subsequent OpenGL rendering calls operate on the current rendering context to modify the drawable
	 * object associated with it.</p>
	 * 
	 * <p>You can use AGL macros to bypass the current rendering context mechanism and maintain your own current rendering context.</p>
	 * 
	 * <p>A context is current on a per-thread basis. Multiple threads must serialize calls into the same context.</p>
	 *
	 * @param context the rendering context to set as the current rendering context. Pass {@code NULL} to release the current rendering context without assigning a new one.
	 */
	public static int CGLSetCurrentContext(long context) {
		long __functionAddress = getInstance().SetCurrentContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return callPI(__functionAddress, context);
	}

	// --- [ CGLGetShareGroup ] ---

	/**
	 * Returns the sharegroup of the specified rendering context.
	 *
	 * @param ctx a rendering context
	 */
	public static long CGLGetShareGroup(long ctx) {
		long __functionAddress = getInstance().GetShareGroup;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPP(__functionAddress, ctx);
	}

	// --- [ CGLChoosePixelFormat ] ---

	/** Unsafe version of {@link #CGLChoosePixelFormat ChoosePixelFormat} */
	@JavadocExclude
	public static int nCGLChoosePixelFormat(long attribs, long pix, long npix) {
		long __functionAddress = getInstance().ChoosePixelFormat;
		return callPPPI(__functionAddress, attribs, pix, npix);
	}

	/**
	 * Creates a pixel format object that satisfies the constraints of the specified buffer and renderer attributes.
	 *
	 * @param attribs a 0 terminated array that contains a list of buffer and renderer attributes. Attributes can be Boolean or integer. If an attribute is integer, you
	 *                must supply the desired value immediately following the attribute. If the attribute is Boolean, do not supply a value because its presence in the
	 *                attributes array implies a true value. One of:<br>{@link #kCGLPFAAllRenderers PFAAllRenderers}, {@link #kCGLPFATripleBuffer PFATripleBuffer}, {@link #kCGLPFADoubleBuffer PFADoubleBuffer}, {@link #kCGLPFAStereo PFAStereo}, {@link #kCGLPFAColorSize PFAColorSize}, {@link #kCGLPFAAlphaSize PFAAlphaSize}, {@link #kCGLPFADepthSize PFADepthSize}, {@link #kCGLPFAStencilSize PFAStencilSize}, {@link #kCGLPFAMinimumPolicy PFAMinimumPolicy}, {@link #kCGLPFAMaximumPolicy PFAMaximumPolicy}, {@link #kCGLPFASampleBuffers PFASampleBuffers}, {@link #kCGLPFASamples PFASamples}, {@link #kCGLPFAColorFloat PFAColorFloat}, {@link #kCGLPFAMultisample PFAMultisample}, {@link #kCGLPFASupersample PFASupersample}, {@link #kCGLPFASampleAlpha PFASampleAlpha}, {@link #kCGLPFARendererID PFARendererID}, {@link #kCGLPFASingleRenderer PFASingleRenderer}, {@link #kCGLPFANoRecovery PFANoRecovery}, {@link #kCGLPFAAccelerated PFAAccelerated}, {@link #kCGLPFAClosestPolicy PFAClosestPolicy}, {@link #kCGLPFABackingStore PFABackingStore}, {@link #kCGLPFABackingVolatile PFABackingVolatile}, {@link #kCGLPFADisplayMask PFADisplayMask}, {@link #kCGLPFAAllowOfflineRenderers PFAAllowOfflineRenderers}, {@link #kCGLPFAAcceleratedCompute PFAAcceleratedCompute}, {@link #kCGLPFAOpenGLProfile PFAOpenGLProfile}, {@link #kCGLPFASupportsAutomaticGraphicsSwitching PFASupportsAutomaticGraphicsSwitching}, {@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}, {@link #kCGLPFAAuxBuffers PFAAuxBuffers}, {@link #kCGLPFAAccumSize PFAAccumSize}, {@link #kCGLPFAOffScreen PFAOffScreen}, {@link #kCGLPFAAuxDepthStencil PFAAuxDepthStencil}, {@link #kCGLPFAWindow PFAWindow}, {@link #kCGLPFACompliant PFACompliant}, {@link #kCGLPFAPBuffer PFAPBuffer}, {@link #kCGLPFARemotePBuffer PFARemotePBuffer}, {@link #kCGLPFARobust PFARobust}, {@link #kCGLPFAMPSafe PFAMPSafe}, {@link #kCGLPFAMultiScreen PFAMultiScreen}, {@link #kCGLPFAFullScreen PFAFullScreen}
	 * @param pix     the memory address of a pixel format object. On return, points to a new pixel format object that contains pixel format information and a list of
	 *                virtual screens. If there are no pixel formats or virtual screens that satisfy the constraints of the buffer and renderer attributes, the value of
	 *                pix is set to {@code NULL}.
	 * @param npix    on return, points to the number of virtual screens referenced by pix. If pix is {@code NULL}, the value of {@code npix} is set to 0.
	 */
	public static int CGLChoosePixelFormat(ByteBuffer attribs, ByteBuffer pix, ByteBuffer npix) {
		if ( LWJGLUtil.CHECKS ) {
			if ( pix != null ) checkBuffer(pix, 1 << POINTER_SHIFT);
			checkBuffer(npix, 1 << 2);
		}
		return nCGLChoosePixelFormat(memAddress(attribs), memAddressSafe(pix), memAddress(npix));
	}

	/** Alternative version of: {@link #CGLChoosePixelFormat ChoosePixelFormat} */
	public static int CGLChoosePixelFormat(IntBuffer attribs, PointerBuffer pix, IntBuffer npix) {
		if ( LWJGLUtil.CHECKS ) {
			if ( pix != null ) checkBuffer(pix, 1);
			checkBuffer(npix, 1);
		}
		return nCGLChoosePixelFormat(memAddress(attribs), memAddressSafe(pix), memAddress(npix));
	}

	// --- [ CGLDestroyPixelFormat ] ---

	/**
	 * Frees the memory associated with a pixel format object. Calling this function is equivalent to calling {@link #CGLReleasePixelFormat ReleasePixelFormat}.
	 *
	 * @param pix the pixel format object to destroy
	 */
	public static int CGLDestroyPixelFormat(long pix) {
		long __functionAddress = getInstance().DestroyPixelFormat;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return callPI(__functionAddress, pix);
	}

	// --- [ CGLDescribePixelFormat ] ---

	/** Unsafe version of {@link #CGLDescribePixelFormat DescribePixelFormat} */
	@JavadocExclude
	public static int nCGLDescribePixelFormat(long pix, int pix_num, int attrib, long value) {
		long __functionAddress = getInstance().DescribePixelFormat;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return callPIIPI(__functionAddress, pix, pix_num, attrib, value);
	}

	/**
	 * Retrieves the values of an attribute associated with a pixel format object.
	 *
	 * @param pix     the pixel format object to query
	 * @param pix_num the virtual screen number whose attribute value you want to retrieve. This value must be between 0 and the number of virtual screens minus one.
	 * @param attrib  the attribute whose value you want to obtain. One of:<br>{@link #kCGLPFAAllRenderers PFAAllRenderers}, {@link #kCGLPFATripleBuffer PFATripleBuffer}, {@link #kCGLPFADoubleBuffer PFADoubleBuffer}, {@link #kCGLPFAStereo PFAStereo}, {@link #kCGLPFAColorSize PFAColorSize}, {@link #kCGLPFAAlphaSize PFAAlphaSize}, {@link #kCGLPFADepthSize PFADepthSize}, {@link #kCGLPFAStencilSize PFAStencilSize}, {@link #kCGLPFAMinimumPolicy PFAMinimumPolicy}, {@link #kCGLPFAMaximumPolicy PFAMaximumPolicy}, {@link #kCGLPFASampleBuffers PFASampleBuffers}, {@link #kCGLPFASamples PFASamples}, {@link #kCGLPFAColorFloat PFAColorFloat}, {@link #kCGLPFAMultisample PFAMultisample}, {@link #kCGLPFASupersample PFASupersample}, {@link #kCGLPFASampleAlpha PFASampleAlpha}, {@link #kCGLPFARendererID PFARendererID}, {@link #kCGLPFASingleRenderer PFASingleRenderer}, {@link #kCGLPFANoRecovery PFANoRecovery}, {@link #kCGLPFAAccelerated PFAAccelerated}, {@link #kCGLPFAClosestPolicy PFAClosestPolicy}, {@link #kCGLPFABackingStore PFABackingStore}, {@link #kCGLPFABackingVolatile PFABackingVolatile}, {@link #kCGLPFADisplayMask PFADisplayMask}, {@link #kCGLPFAAllowOfflineRenderers PFAAllowOfflineRenderers}, {@link #kCGLPFAAcceleratedCompute PFAAcceleratedCompute}, {@link #kCGLPFAOpenGLProfile PFAOpenGLProfile}, {@link #kCGLPFASupportsAutomaticGraphicsSwitching PFASupportsAutomaticGraphicsSwitching}, {@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}, {@link #kCGLPFAAuxBuffers PFAAuxBuffers}, {@link #kCGLPFAAccumSize PFAAccumSize}, {@link #kCGLPFAOffScreen PFAOffScreen}, {@link #kCGLPFAAuxDepthStencil PFAAuxDepthStencil}, {@link #kCGLPFAWindow PFAWindow}, {@link #kCGLPFACompliant PFACompliant}, {@link #kCGLPFAPBuffer PFAPBuffer}, {@link #kCGLPFARemotePBuffer PFARemotePBuffer}, {@link #kCGLPFARobust PFARobust}, {@link #kCGLPFAMPSafe PFAMPSafe}, {@link #kCGLPFAMultiScreen PFAMultiScreen}, {@link #kCGLPFAFullScreen PFAFullScreen}
	 * @param value   on return, points to the value of the attribute
	 */
	public static int CGLDescribePixelFormat(long pix, int pix_num, int attrib, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nCGLDescribePixelFormat(pix, pix_num, attrib, memAddress(value));
	}

	/** Alternative version of: {@link #CGLDescribePixelFormat DescribePixelFormat} */
	public static int CGLDescribePixelFormat(long pix, int pix_num, int attrib, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return nCGLDescribePixelFormat(pix, pix_num, attrib, memAddress(value));
	}

	// --- [ CGLReleasePixelFormat ] ---

	/**
	 * Decrements the reference count of a pixel format object.
	 * 
	 * <p>The system retains the pixel format object when you call the function {@link #CGLCreateContext CreateContext}, so you can release a pixel format object immediately
	 * after passing it to the context creation function.</p>
	 * 
	 * <p>Each call to CGLReleasePixelFormat decreases the reference count by 1. If the reference count reaches 0, the pixel format object is destroyed.</p>
	 *
	 * @param pix the pixel format object whose reference count should be decremented
	 */
	public static void CGLReleasePixelFormat(long pix) {
		long __functionAddress = getInstance().ReleasePixelFormat;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		callPV(__functionAddress, pix);
	}

	// --- [ CGLRetainPixelFormat ] ---

	/**
	 * Increments the receiver's reference count.
	 * 
	 * <p>Each call to CGLRetainPixelFormat increases the reference count by 1. Each call to CGLRetainPixelFormat must be matched with a call to
	 * {@link #CGLReleasePixelFormat ReleasePixelFormat}.</p>
	 *
	 * @param pix the pixel format object whose reference count should be incremented
	 */
	public static long CGLRetainPixelFormat(long pix) {
		long __functionAddress = getInstance().RetainPixelFormat;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return callPP(__functionAddress, pix);
	}

	// --- [ CGLGetPixelFormatRetainCount ] ---

	/**
	 * Returns the retain count of a pixel format object.
	 *
	 * @param pix a pixel format object
	 */
	public static int CGLGetPixelFormatRetainCount(long pix) {
		long __functionAddress = getInstance().GetPixelFormatRetainCount;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return callPI(__functionAddress, pix);
	}

	// --- [ CGLQueryRendererInfo ] ---

	/** Unsafe version of {@link #CGLQueryRendererInfo QueryRendererInfo} */
	@JavadocExclude
	public static int nCGLQueryRendererInfo(int display_mask, long rend, long nrend) {
		long __functionAddress = getInstance().QueryRendererInfo;
		return callIPPI(__functionAddress, display_mask, rend, nrend);
	}

	/**
	 * Creates a renderer information object that contains properties and values for renderers able to drive all the specified displays in a given display
	 * mask.
	 *
	 * @param display_mask a bit field that contains the bitwise OR of OpenGL display masks returned by the CGDisplayIDToOpenGLDisplayMask function. If you want to obtain
	 *                     information for all renderers in the system you must call CGLQueryRendererInfo once for each display bit.
	 * @param rend         the memory address of a renderer information object. On return, points to a renderer information object that describes all renderers that are able
	 *                     to drive the displays specified by the {@code display_mask} parameter. If {@code display_mask} does not specify any displays, the value of
	 *                     {@code rend} is set to {@code NULL}. You must call {@link #CGLDestroyRendererInfo DestroyRendererInfo} when you no longer need this object.
	 * @param nrend        on return, points to the number of renderers described in the renderer information object. If {@code display_mask} does not specify any displays,
	 *                     the value of {@code nrend} is set to 0.
	 */
	public static int CGLQueryRendererInfo(int display_mask, ByteBuffer rend, ByteBuffer nrend) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(rend, 1 << POINTER_SHIFT);
			checkBuffer(nrend, 1 << 2);
		}
		return nCGLQueryRendererInfo(display_mask, memAddress(rend), memAddress(nrend));
	}

	/** Alternative version of: {@link #CGLQueryRendererInfo QueryRendererInfo} */
	public static int CGLQueryRendererInfo(int display_mask, PointerBuffer rend, IntBuffer nrend) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(rend, 1);
			checkBuffer(nrend, 1);
		}
		return nCGLQueryRendererInfo(display_mask, memAddress(rend), memAddress(nrend));
	}

	// --- [ CGLDestroyRendererInfo ] ---

	/**
	 * Frees resources associated with a renderer information object.
	 *
	 * @param rend the renderer information object to destroy
	 */
	public static int CGLDestroyRendererInfo(long rend) {
		long __functionAddress = getInstance().DestroyRendererInfo;
		if ( LWJGLUtil.CHECKS )
			checkPointer(rend);
		return callPI(__functionAddress, rend);
	}

	// --- [ CGLDescribeRenderer ] ---

	/** Unsafe version of {@link #CGLDescribeRenderer DescribeRenderer} */
	@JavadocExclude
	public static int nCGLDescribeRenderer(long rend, int rend_num, int prop, long value) {
		long __functionAddress = getInstance().DescribeRenderer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(rend);
		return callPIIPI(__functionAddress, rend, rend_num, prop, value);
	}

	/**
	 * Obtains the value associated with a renderer property.
	 *
	 * @param rend     an opaque renderer information object that contains a description of the renderer capabilities you want to inspect. You can obtain a renderer
	 *                 information object by calling the function {@link #CGLQueryRendererInfo QueryRendererInfo}. You must call {@link #CGLDestroyRendererInfo DestroyRendererInfo} when you no longer need this
	 *                 object.
	 * @param rend_num the index of the renderer inside the renderer information object — a value between 0 and the number of renderers minus one. The number of renderers
	 *                 can be obtained by calling {@link #CGLDescribeRenderer DescribeRenderer}, passing in {@code rend}, renderer number 0, and the renderer property
	 *                 {@link #kCGLRPRendererCount RPRendererCount}.
	 * @param prop     the renderer property whose value you want to obtain. One of:<br>{@link #kCGLRPOffScreen RPOffScreen}, {@link #kCGLRPRendererID RPRendererID}, {@link #kCGLRPAccelerated RPAccelerated}, {@link #kCGLRPBackingStore RPBackingStore}, {@link #kCGLRPWindow RPWindow}, {@link #kCGLRPCompliant RPCompliant}, {@link #kCGLRPDisplayMask RPDisplayMask}, {@link #kCGLRPBufferModes RPBufferModes}, {@link #kCGLRPColorModes RPColorModes}, {@link #kCGLRPAccumModes RPAccumModes}, {@link #kCGLRPDepthModes RPDepthModes}, {@link #kCGLRPStencilModes RPStencilModes}, {@link #kCGLRPMaxAuxBuffers RPMaxAuxBuffers}, {@link #kCGLRPMaxSampleBuffers RPMaxSampleBuffers}, {@link #kCGLRPMaxSamples RPMaxSamples}, {@link #kCGLRPSampleModes RPSampleModes}, {@link #kCGLRPSampleAlpha RPSampleAlpha}, {@link #kCGLRPVideoMemory RPVideoMemory}, {@link #kCGLRPTextureMemory RPTextureMemory}, {@link #kCGLRPGPUVertProcCapable RPGPUVertProcCapable}, {@link #kCGLRPGPUFragProcCapable RPGPUFragProcCapable}, {@link #kCGLRPRendererCount RPRendererCount}, {@link #kCGLRPOnline RPOnline}, {@link #kCGLRPAcceleratedCompute RPAcceleratedCompute}, {@link #kCGLRPVideoMemoryMegabytes RPVideoMemoryMegabytes}, {@link #kCGLRPTextureMemoryMegabytes RPTextureMemoryMegabytes}, {@link #kCGLRPRobust RPRobust}, {@link #kCGLRPMPSafe RPMPSafe}, {@link #kCGLRPMultiScreen RPMultiScreen}, {@link #kCGLRPFullScreen RPFullScreen}
	 * @param value    on return, points to the value of the requested property
	 */
	public static int CGLDescribeRenderer(long rend, int rend_num, int prop, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		return nCGLDescribeRenderer(rend, rend_num, prop, memAddress(value));
	}

	/** Alternative version of: {@link #CGLDescribeRenderer DescribeRenderer} */
	public static int CGLDescribeRenderer(long rend, int rend_num, int prop, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		return nCGLDescribeRenderer(rend, rend_num, prop, memAddress(value));
	}

	// --- [ CGLCreateContext ] ---

	/** Unsafe version of {@link #CGLCreateContext CreateContext} */
	@JavadocExclude
	public static int nCGLCreateContext(long pix, long share, long ctx) {
		long __functionAddress = getInstance().CreateContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(pix);
			checkPointer(share);
		}
		return callPPPI(__functionAddress, pix, share, ctx);
	}

	/**
	 * Creates a CGL rendering context.
	 *
	 * @param pix   a pixel format object created by calling the function {@link #CGLChoosePixelFormat ChoosePixelFormat}
	 * @param share the rendering context with which to share the OpenGL object state — including texture objects, programs and shader display lists, vertex array
	 *              objects, vertex buffer objects, pixel buffer objects, and frame buffer objects — and the object state associated which each of these object types.
	 *              Pass {@code NULL} to indicate that no sharing is to take place.
	 * @param ctx   the memory address of a context object. On return, points to a new context object with the buffers and attributes specified by the {@code pix}
	 *              parameter. If the context can not be created as specified, the value of {@code ctx} is set to {@code NULL}.
	 */
	public static int CGLCreateContext(long pix, long share, ByteBuffer ctx) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ctx, 1 << POINTER_SHIFT);
		return nCGLCreateContext(pix, share, memAddress(ctx));
	}

	/** Alternative version of: {@link #CGLCreateContext CreateContext} */
	public static int CGLCreateContext(long pix, long share, PointerBuffer ctx) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ctx, 1);
		return nCGLCreateContext(pix, share, memAddress(ctx));
	}

	// --- [ CGLDestroyContext ] ---

	/**
	 * Frees the resources associated with a rendering context.
	 * 
	 * <p>Starting in Mac OS 10.5, CGL rendering contexts are reference counted. For compatibility reasons, calling CGLDestroyContext clears the drawable
	 * associated with the rendering context. Calling CGLDestroyContext is the equivalent of calling both {@link #CGLClearDrawable ClearDrawable} and
	 * {@link #CGLReleaseContext ReleaseContext}.</p>
	 *
	 * @param ctx the rendering context to destroy
	 */
	public static int CGLDestroyContext(long ctx) {
		long __functionAddress = getInstance().DestroyContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ CGLCopyContext ] ---

	/**
	 * Copies the specified state variables from one rendering context to another.
	 *
	 * @param src  the source rendering context
	 * @param dst  the destination rendering context
	 * @param mask a mask that specifies the state variables to copy. Pass a bit field that contains the bitwise OR of the state variable names that you want to copy.
	 *             Use the symbolic mask constants that are passed to the OpenGL function {@link GL11#glPushAttrib}. To copy as many state variables
	 *             as possible, supply the constant {@link GL11#GL_ALL_ATTRIB_BITS}.
	 */
	public static int CGLCopyContext(long src, long dst, int mask) {
		long __functionAddress = getInstance().CopyContext;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(src);
			checkPointer(dst);
		}
		return callPPII(__functionAddress, src, dst, mask);
	}

	// --- [ CGLRetainContext ] ---

	/**
	 * Increments the retain count on a CGL rendering context.
	 * 
	 * <p>Each call to CGLRetainContext increases the retain count by 1. To prevent memory leaks, each retain call must be balanced with a call to
	 * {@link #CGLReleaseContext ReleaseContext}.</p>
	 *
	 * @param ctx the rendering context to be retained
	 *
	 * @return the same context that was passed into the function.
	 */
	public static long CGLRetainContext(long ctx) {
		long __functionAddress = getInstance().RetainContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPP(__functionAddress, ctx);
	}

	// --- [ CGLReleaseContext ] ---

	/**
	 * Decrements the retain count on a CGL rendering context.
	 * 
	 * <p>Each call to CGLReleaseContext decreases the retain count by 1.</p>
	 * 
	 * <p>When the retain count reaches 0, all resources associated with the rendering context are freed. If the rendering context that you pass is the current
	 * rendering context and it is freed, the current context is set to {@code NULL} and there is no current rendering context after the function executes. After the
	 * context is freed, you must make sure you do not use the destroyed rendering context. This includes using CGL macros in which the rendering context is
	 * explicitly passed to OpenGL.</p>
	 *
	 * @param ctx the rendering context to be released
	 */
	public static void CGLReleaseContext(long ctx) {
		long __functionAddress = getInstance().ReleaseContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		callPV(__functionAddress, ctx);
	}

	// --- [ CGLGetContextRetainCount ] ---

	/**
	 * Returns the current retain count of a CGL rendering context.
	 *
	 * @param ctx the CGL rendering context whose retain count you wish to discover
	 */
	public static int CGLGetContextRetainCount(long ctx) {
		long __functionAddress = getInstance().GetContextRetainCount;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ CGLGetPixelFormat ] ---

	/**
	 * Retrieves the current pixel format associated with a CGL rendering context.
	 * 
	 * <p>The pixel format object is not retained before being returned to your application. If your application needs to maintain this object, it should call
	 * {@link #CGLRetainPixelFormat RetainPixelFormat}.</p>
	 *
	 * @param ctx the CGL rendering context whose format you want to receive
	 */
	public static long CGLGetPixelFormat(long ctx) {
		long __functionAddress = getInstance().GetPixelFormat;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPP(__functionAddress, ctx);
	}

	// --- [ CGLCreatePBuffer ] ---

	/** Unsafe version of {@link #CGLCreatePBuffer CreatePBuffer} */
	@JavadocExclude
	public static int nCGLCreatePBuffer(int width, int height, int target, int internalFormat, int max_level, long pbuffer) {
		long __functionAddress = getInstance().CreatePBuffer;
		return callIIIIIPI(__functionAddress, width, height, target, internalFormat, max_level, pbuffer);
	}

	/**
	 * Creates a pixel buffer of the specified size, compatible with the specified texture target.
	 * 
	 * <p>This function does not have any knowledge of OpenGL contexts or pixel format objects and does not specifically allocate the storage needed for the
	 * actual pixel buffer. These operations occur when you call the function {@link #CGLSetPBuffer SetPBuffer}.</p>
	 * 
	 * <p>You can determine the dimensional limits of a pixel buffer by calling the OpenGL function glGetInteger. You can find the maximum size supported by
	 * querying GL_MAX_VIEWPORT_DIMS and the minimum size by querying GL_MIN_PBUFFER_VIEWPORT_DIMS_APPLE, which returns two integer values (similar to
	 * GL_MAX_VIEWPORT_DIMS). All pixel buffer dimensions that you request with the function aglCreatePBuffer should fall within these limits (inclusively)
	 * and should comply with any limitations imposed by the texture target you select.</p>
	 * 
	 * <p>The maximum viewport size supported in OS X is quite large. You should take into consideration the amount of video or system memory required to support
	 * the requested pixel buffer size, including additional memory needed for multiple buffers and options such as multisampling.</p>
	 * 
	 * <p>Starting in OS X v10.5, pixel buffer objects are reference counted. Pixel buffer objects are created with a reference count of 1 and are destroyed when
	 * the last reference to the object is released.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param width          the width, in pixels, of the pixel buffer
	 * @param height         the height, in pixels, of the pixel buffer
	 * @param target         a constant that specifies the type of the pixel buffer target texture. One of:<br>{@link GL11#GL_TEXTURE_2D}, {@link GL13#GL_TEXTURE_CUBE_MAP}, {@link GL31#GL_TEXTURE_RECTANGLE}
	 * @param internalFormat a constant that specifies the internal color format of the pixel buffer. The format controls whether the alpha channel of the pixel buffer is used
	 *                       for texturing operations. One of:<br>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}
	 * @param max_level      the maximum level of mipmap detail allowable. Pass 0 for a pixel buffer that is not using mipmaps. The value passed should never exceed the actual
	 *                       maximum number of mipmap levels that can be represented with the given width and height.
	 * @param pbuffer        on return, points to a new pixel buffer object
	 */
	public static int CGLCreatePBuffer(int width, int height, int target, int internalFormat, int max_level, ByteBuffer pbuffer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pbuffer, 1 << POINTER_SHIFT);
		return nCGLCreatePBuffer(width, height, target, internalFormat, max_level, memAddress(pbuffer));
	}

	/** Alternative version of: {@link #CGLCreatePBuffer CreatePBuffer} */
	public static int CGLCreatePBuffer(int width, int height, int target, int internalFormat, int max_level, PointerBuffer pbuffer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pbuffer, 1);
		return nCGLCreatePBuffer(width, height, target, internalFormat, max_level, memAddress(pbuffer));
	}

	// --- [ CGLDestroyPBuffer ] ---

	/**
	 * Releases the resources associated with a pixel buffer object.
	 * 
	 * <p>Starting in OS X v10.5, pixel buffer objects are reference counted. Calling this function is equivalent to calling {@link #CGLReleasePBuffer ReleasePBuffer}.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param pbuffer the pixel buffer object whose resources you want to release
	 */
	public static int CGLDestroyPBuffer(long pbuffer) {
		long __functionAddress = getInstance().DestroyPBuffer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		return callPI(__functionAddress, pbuffer);
	}

	// --- [ CGLDescribePBuffer ] ---

	/** Unsafe version of {@link #CGLDescribePBuffer DescribePBuffer} */
	@JavadocExclude
	public static int nCGLDescribePBuffer(long obj, long width, long height, long target, long internalFormat, long mipmap) {
		long __functionAddress = getInstance().DescribePBuffer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(obj);
		return callPPPPPPI(__functionAddress, obj, width, height, target, internalFormat, mipmap);
	}

	/**
	 * Retrieves information that describes the specified pixel buffer object.
	 * 
	 * <p>The width, height, texture target, and internal texture color format of a pixel buffer object are set at its creation and cannot be changed without
	 * destroying and recreating the object. The level is set when the pixel buffer object is attached to a rendering context by calling the function
	 * {@link #CGLSetPBuffer SetPBuffer}.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param obj            a pointer to the pixel buffer object
	 * @param width          on return, points to the width, in pixels, of the pixel buffer
	 * @param height         on return, points to the height, in pixels, of the pixel buffer
	 * @param target         on return, points to a constant that specifies the pixel buffer texture target
	 * @param internalFormat on return, points to a constant that specifies the internal color format of the pixel buffer
	 * @param mipmap         on return, points to the mipmap level of the pixel buffer or 0 if it doesn't use mipmaps
	 */
	public static int CGLDescribePBuffer(long obj, ByteBuffer width, ByteBuffer height, ByteBuffer target, ByteBuffer internalFormat, ByteBuffer mipmap) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
			checkBuffer(target, 1 << 2);
			checkBuffer(internalFormat, 1 << 2);
			checkBuffer(mipmap, 1 << 2);
		}
		return nCGLDescribePBuffer(obj, memAddress(width), memAddress(height), memAddress(target), memAddress(internalFormat), memAddress(mipmap));
	}

	/** Alternative version of: {@link #CGLDescribePBuffer DescribePBuffer} */
	public static int CGLDescribePBuffer(long obj, IntBuffer width, IntBuffer height, IntBuffer target, IntBuffer internalFormat, IntBuffer mipmap) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(width, 1);
			checkBuffer(height, 1);
			checkBuffer(target, 1);
			checkBuffer(internalFormat, 1);
			checkBuffer(mipmap, 1);
		}
		return nCGLDescribePBuffer(obj, memAddress(width), memAddress(height), memAddress(target), memAddress(internalFormat), memAddress(mipmap));
	}

	// --- [ CGLTexImagePBuffer ] ---

	/**
	 * Binds the contents of a pixel buffer to a data source for a texture object.
	 * 
	 * <p>You must generate and bind a texture name (using standard OpenGL texturing calls) that is compatible with the pixel buffer texture target. Don't supply
	 * a texture object that was used previously for nonpixel buffer texturing operations unless you first call glDeleteTextures to regenerate the texture
	 * name.</p>
	 * 
	 * <p>If you modify the content of a pixel buffer that uses mipmap levels, you must call this function again before drawing with the pixel buffer, to ensure
	 * that the content is synchronized with OpenGL. For pixel buffers without mipmaps, simply rebind to the texture object to synchronize content.</p>
	 * 
	 * <p>No OpenGL texturing calls that modify a pixel buffer texture content are permitted (such as glTexSubImage2D or glCopyTexImage2D) with the pixel buffer
	 * texture as the destination. It is permitted to use texturing commands to read data from a pixel buffer texture, such as glCopyTexImage2D, with the
	 * pixel buffer texture as the source. It is also legal to use OpenGL functions such as glReadPixels to read the contents of a pixel buffer directly
	 * through the pixel buffer context.</p>
	 * 
	 * <p>Note that texturing with the CGLTexImagePBuffer function can fail to produce the intended results without error in the same way other OpenGL texturing
	 * commands can normally fail. The function fails if you set an incompatible filter mode, do not enable the proper texture target, or other conditions
	 * described in the OpenGL specification.</p>
	 * 
	 * <p>You don't need to share a context to use a pixel buffer object as a texture source. You can use independent pixel format objects and OpenGL contexts
	 * for both the pixel buffer and the target drawable object without sharing resources, and still texture using a pixel buffer in the target context.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param ctx     a rendering context, which is the target context for the texture operation. This is the context that you plan to render content to. This is not the
	 *                context attached to the pixel buffer.
	 * @param pbuffer a pixel buffer object
	 * @param source  the source buffer to get the texture from, which should be a valid OpenGL buffer such as GL_FRONT or GL_BACK and should be compatible with the
	 *                buffer and renderer attributes that you used to create the rendering context attached to the pixel buffer. This means that the pixel buffer must
	 *                possess the buffer in question for the texturing operation to succeed.
	 */
	public static int CGLTexImagePBuffer(long ctx, long pbuffer, int source) {
		long __functionAddress = getInstance().TexImagePBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkPointer(pbuffer);
		}
		return callPPII(__functionAddress, ctx, pbuffer, source);
	}

	// --- [ CGLRetainPBuffer ] ---

	/**
	 * Increments the retain count on a pixel buffer object.
	 * 
	 * <p>Each call to CGLRetainPBuffer increases the retain count by 1. To prevent the pixel buffer object from being leaked, each retain call must be matched
	 * with a call to {@link #CGLReleasePBuffer ReleasePBuffer}.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param pbuffer the pixel buffer object whose retain count you wish to increment
	 */
	public static long CGLRetainPBuffer(long pbuffer) {
		long __functionAddress = getInstance().RetainPBuffer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		return callPP(__functionAddress, pbuffer);
	}

	// --- [ CGLReleasePBuffer ] ---

	/**
	 * Releases the resources associated with a pixel buffer object.
	 * 
	 * <p>Starting in OS X v10.5, pixel buffer objects are reference counted. Calling this function is equivalent to calling CGLReleasePBuffer.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param pbuffer the pixel buffer object whose resources you want to release
	 */
	public static void CGLReleasePBuffer(long pbuffer) {
		long __functionAddress = getInstance().ReleasePBuffer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		callPV(__functionAddress, pbuffer);
	}

	// --- [ CGLGetPBufferRetainCount ] ---

	/**
	 * Returns the retain count of a pixel buffer object.
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param pbuffer the pixel buffer object whose retain count you wish to retrieve
	 */
	public static int CGLGetPBufferRetainCount(long pbuffer) {
		long __functionAddress = getInstance().GetPBufferRetainCount;
		if ( LWJGLUtil.CHECKS )
			checkPointer(pbuffer);
		return callPI(__functionAddress, pbuffer);
	}

	// --- [ CGLSetOffScreen ] ---

	/** Unsafe version of {@link #CGLSetOffScreen SetOffScreen} */
	@JavadocExclude
	public static int nCGLSetOffScreen(long ctx, int width, int height, int rowbytes, long baseaddr) {
		long __functionAddress = getInstance().SetOffScreen;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPIIIPI(__functionAddress, ctx, width, height, rowbytes, baseaddr);
	}

	/**
	 * Attaches a rendering context to an offscreen buffer.
	 * 
	 * <p>Before calling this function, you must set up the rendering context using a pixel format object created with the kCGLPFAOffScreen attribute. For more
	 * information about kCGLPFAOffScreen, see Buffer and Renderer Attributes.</p>
	 * 
	 * <p>After calling this function, subsequent OpenGL drawing is rendered into the offscreen buffer and the viewport of the rendering context is set to the
	 * full size of the offscreen area.</p>
	 * 
	 * <p>To exit offscreen mode, call {@link #CGLClearDrawable ClearDrawable}.</p>
	 * 
	 * <p>To obtain functionality similar to offscreen mode on renderers that do not support it, attach the context to a hidden window and use the OpenGL
	 * function glReadPixels.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param ctx      a rendering context
	 * @param width    the width, in pixels, of the offscreen buffer
	 * @param height   the height, in pixels, of the offscreen buffer
	 * @param rowbytes the number of bytes per row of the offscreen buffer, which must be greater than or equal to width times bytes per pixel
	 * @param baseaddr a pointer to a block of memory to use as the offscreen buffer. The size of the memory must be at least {@code rowbytes*height} bytes.
	 */
	public static int CGLSetOffScreen(long ctx, int width, int height, int rowbytes, ByteBuffer baseaddr) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(baseaddr, rowbytes * height);
		return nCGLSetOffScreen(ctx, width, height, rowbytes, memAddress(baseaddr));
	}

	// --- [ CGLGetOffScreen ] ---

	/** Unsafe version of {@link #CGLGetOffScreen GetOffScreen} */
	@JavadocExclude
	public static int nCGLGetOffScreen(long ctx, long width, long height, long rowbytes, long baseaddr) {
		long __functionAddress = getInstance().GetOffScreen;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPPPPPI(__functionAddress, ctx, width, height, rowbytes, baseaddr);
	}

	/**
	 * Retrieves an offscreen buffer and its parameters for a specified rendering context.
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param ctx      a rendering context
	 * @param width    on return, points to the width, in pixels, of the offscreen buffer. If the rendering context is not attached to an offscreen drawable object, the
	 *                 value of width is set to 0.
	 * @param height   on return, points to the height, in pixels, of the offscreen buffer. If the rendering context is not attached to an offscreen drawable object, the
	 *                 value of height is set to 0.
	 * @param rowbytes on return, points to the number of bytes per row of the offscreen buffer. If the context is not attached to an offscreen drawable object, the value
	 *                 of rowbytes is set to 0.
	 * @param baseaddr on return, points to the base address of the offscreen buffer. If the context is not attached to an offscreen drawable object, the value of
	 *                 {@code baseaddr} is set to {@code NULL}.
	 */
	public static int CGLGetOffScreen(long ctx, ByteBuffer width, ByteBuffer height, ByteBuffer rowbytes, ByteBuffer baseaddr) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
			checkBuffer(rowbytes, 1 << 2);
			checkBuffer(baseaddr, 1 << POINTER_SHIFT);
		}
		return nCGLGetOffScreen(ctx, memAddress(width), memAddress(height), memAddress(rowbytes), memAddress(baseaddr));
	}

	/** Alternative version of: {@link #CGLGetOffScreen GetOffScreen} */
	public static int CGLGetOffScreen(long ctx, IntBuffer width, IntBuffer height, IntBuffer rowbytes, PointerBuffer baseaddr) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(width, 1);
			checkBuffer(height, 1);
			checkBuffer(rowbytes, 1);
			checkBuffer(baseaddr, 1);
		}
		return nCGLGetOffScreen(ctx, memAddress(width), memAddress(height), memAddress(rowbytes), memAddress(baseaddr));
	}

	// --- [ CGLSetFullScreen ] ---

	/**
	 * Attaches a rendering context to its full-screen drawable object.
	 * 
	 * <p>Before calling this function, you must set up the rendering context using a pixel format object created with the kCGLPFAFullScreen attribute (see
	 * Buffer and Renderer Attributes). Some OpenGL renderers, such as the software renderer, do not support full-screen mode. After you call the function
	 * {@link #CGLChoosePixelFormat ChoosePixelFormat} with the full-screen attribute, you need to check whether the pixel format object is created successfully.</p>
	 * 
	 * <p>You must capture the display prior to entering full-screen mode and release it after exiting. After calling this function, subsequent OpenGL drawing is
	 * rendered into the entire screen. For more information, see
	 * <a href="https://developer.apple.com/library/mac/documentation/GraphicsImaging/Conceptual/OpenGL-MacProgGuide/opengl_intro/opengl_intro.html\#//apple_ref/doc/uid/TP40001987">OpenGL Programming Guide for Mac</a>.</p>
	 * 
	 * <p>To exit full-screen mode, call {@link #CGLClearDrawable ClearDrawable}.</p>
	 * 
	 * <p>Deprecated in OS X v10.7. Use {@link #CGLSetFullScreenOnDisplay SetFullScreenOnDisplay} instead.</p>
	 *
	 * @param ctx a rendering context
	 */
	public static int CGLSetFullScreen(long ctx) {
		long __functionAddress = getInstance().SetFullScreen;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ CGLSetFullScreenOnDisplay ] ---

	/**
	 * Attaches a rendering context to a full-screen drawable object." +
	 * 
	 * <p>This function obtains a drawable object that covers an entire screen and attaches it to the rendering context. A full-screen rendering context may
	 * allow the underlying renderer to provide better performance compared to a context associated with a window that partially covers the screen.</p>
	 * 
	 * <p>Prior to calling this function, your application should ensure that the context is capable of rendering to this display by querying the appropriate
	 * renderer properties. For more information, see {@link #CGLQueryRendererInfo QueryRendererInfo}. Note that some renderers, including the software renderer, do not support
	 * full-screen mode.</p>
	 * 
	 * <p>You must capture the screen prior to entering full-screen mode and release it after exiting. After calling this function, subsequent OpenGL drawing is
	 * rendered into the entire screen. For more information, see OpenGL Programming Guide for Mac.</p>
	 * 
	 * <p>To exit full-screen mode, call {@link #CGLClearDrawable ClearDrawable}.</p>
	 * 
	 * <p>In OS X v10.6 or later, this function is not deprecated, but is usually not necessary. If your application creates a window that completely covers the
	 * screen, the system implicitly creates a full-screen instance, for the same potential performance benefit.</p>
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param ctx          a rendering context
	 * @param display_mask a bit field that contains the OpenGL display mask for the screen you wish the context to cover
	 */
	public static int CGLSetFullScreenOnDisplay(long ctx, int display_mask) {
		long __functionAddress = getInstance().SetFullScreenOnDisplay;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPII(__functionAddress, ctx, display_mask);
	}

	// --- [ CGLSetPBuffer ] ---

	/**
	 * Attaches a pixel buffer object to a rendering context.
	 * 
	 * <p>The first time you call this function for a specific pixel buffer object, the system creates the necessary buffers. The buffers are created to support
	 * the attributes dictated by the pixel format object used to create the rendering context and by the parameters used to create the pixel buffer object.
	 * The storage requirements for pixel buffer objects, which can be quite large, are very similar to the requirements for windows or views with OpenGL
	 * contexts attached. All drawable objects compete for the same scarce resources. This function can fail is there is not enough contiguous VRAM for each
	 * buffer. It's best to code defensively with a scheme that reduces resource consumption without causing the application to resort to failure. Unless, of
	 * course, failure is the only viable alternative.</p>
	 * 
	 * <p>The ability to attach a pixel buffer to a context is supported only on renderers that export GL_APPLE_pixel_buffer in the GL_EXTENSIONS string. Before
	 * calling this function, you should programmatically determine if it’s possible to attach a pixel buffer to a context by querying GL_EXTENSIONS in the
	 * context and looking for GL_APPLE_pixel_buffer. If that extension is not present, the renderer won’t allow setting the pixel buffer.</p>
	 * 
	 * <p>In order of performance, these are the renderers you should consider using when setting up a rendering context to attach to a pixel buffer:
	 * <ul>
	 * <li>A hardware renderer.</li>
	 * <li>The generic render, but only with an offscreen pixel format and glTexSubImage.</li>
	 * <li>The Apple software renderer, which supports pixel buffers in OS X v10.4.8 and later.</li>
	 * </ul>
	 * Deprecated in OS X v10.7.</p>
	 *
	 * @param ctx     the rendering context to attach the pixel buffer to
	 * @param pbuffer a pixel buffer object
	 * @param face    the cube map face to draw if the pixel buffer texture target type is {@link GL13#GL_TEXTURE_CUBE_MAP}; otherwise pass 0.
	 * @param level   the mipmap level to draw. This must not exceed the maximum mipmap level set when the pixel buffer object was created. Pass 0 for a texture target
	 *                that does not support mipmaps.
	 * @param screen  a virtual screen value. The virtual screen determines the renderer OpenGL uses to draw to the pixel buffer object. For best performance, for a
	 *                pixel buffer used as a texture source, you should supply the virtual screen value that results in using the same renderer used by the context
	 *                that's the texturing target.
	 */
	public static int CGLSetPBuffer(long ctx, long pbuffer, int face, int level, int screen) {
		long __functionAddress = getInstance().SetPBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkPointer(pbuffer);
		}
		return callPPIIII(__functionAddress, ctx, pbuffer, face, level, screen);
	}

	// --- [ CGLGetPBuffer ] ---

	/** Unsafe version of {@link #CGLGetPBuffer GetPBuffer} */
	@JavadocExclude
	public static int nCGLGetPBuffer(long ctx, long pbuffer, long face, long level, long screen) {
		long __functionAddress = getInstance().GetPBuffer;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPPPPPI(__functionAddress, ctx, pbuffer, face, level, screen);
	}

	/**
	 * Retrieves a pixel buffer and its parameters for a specified rendering context.
	 * 
	 * <p>Deprecated in OS X v10.7.</p>
	 *
	 * @param ctx     a rendering context
	 * @param pbuffer on return, points to the pixel buffer object attached to the rendering context
	 * @param face    on return, points to the cube map face that is set if the pixel buffer texture target type is {@link GL13#GL_TEXTURE_CUBE_MAP}; otherwise 0 for all other
	 *                texture target types.
	 * @param level   on return, points to the current mipmap level for drawing
	 * @param screen  on return, points to the current virtual screen number, as set by the last valid call to {@link #CGLSetPBuffer SetPBuffer}
	 */
	public static int CGLGetPBuffer(long ctx, ByteBuffer pbuffer, ByteBuffer face, ByteBuffer level, ByteBuffer screen) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pbuffer, 1 << POINTER_SHIFT);
			checkBuffer(face, 1 << 2);
			checkBuffer(level, 1 << 2);
			checkBuffer(screen, 1 << 2);
		}
		return nCGLGetPBuffer(ctx, memAddress(pbuffer), memAddress(face), memAddress(level), memAddress(screen));
	}

	/** Alternative version of: {@link #CGLGetPBuffer GetPBuffer} */
	public static int CGLGetPBuffer(long ctx, PointerBuffer pbuffer, IntBuffer face, IntBuffer level, IntBuffer screen) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pbuffer, 1);
			checkBuffer(face, 1);
			checkBuffer(level, 1);
			checkBuffer(screen, 1);
		}
		return nCGLGetPBuffer(ctx, memAddress(pbuffer), memAddress(face), memAddress(level), memAddress(screen));
	}

	// --- [ CGLClearDrawable ] ---

	/**
	 * Disassociates a rendering context from any drawable objects attached to it.
	 *
	 * @param ctx a rendering context
	 */
	public static int CGLClearDrawable(long ctx) {
		long __functionAddress = getInstance().ClearDrawable;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ CGLFlushDrawable ] ---

	/**
	 * Copies the back buffer of a double-buffered context to the front buffer.
	 * 
	 * <p>To create a double-buffered context, specify the {@link #kCGLPFADoubleBuffer PFADoubleBuffer} attribute when you create the pixel format object for the rendering
	 * context. If the backing store attribute is set to false, the buffers can be exchanged rather than copied. This is often the case in full-screen mode. If
	 * the receiver is not a double-buffered context, this call does nothing.</p>
	 * 
	 * <p>If you set the swap interval attribute ({@link #kCGLCPSwapInterval CPSwapInterval}) appropriately, the copy takes place during the vertical retrace of the display,
	 * rather than immediately after CGLFlushDrawable is called. An implicit {@link GL11#glFlush} operation is performed by CGLFlushDrawable
	 * before it returns. For optimal performance, an application should not call glFlush immediately before calling CGLFlushDrawable. Subsequent OpenGL
	 * commands can be issued immediately after calling CGLFlushDrawable, but are not executed until the buffer copy is completed.</p>
	 *
	 * @param ctx the context object
	 */
	public static int CGLFlushDrawable(long ctx) {
		long __functionAddress = getInstance().FlushDrawable;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ CGLEnable ] ---

	/**
	 * Enables an option for a rendering context.
	 *
	 * @param ctx   a rendering context
	 * @param pname the option to enable. One of:<br>{@link #kCGLCESwapRectangle CESwapRectangle}, {@link #kCGLCESwapLimit CESwapLimit}, {@link #kCGLCERasterization CERasterization}, {@link #kCGLCEStateValidation CEStateValidation}, {@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}, {@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}, {@link #kCGLCEMPEngine CEMPEngine}
	 */
	public static int CGLEnable(long ctx, int pname) {
		long __functionAddress = getInstance().Enable;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPII(__functionAddress, ctx, pname);
	}

	// --- [ CGLDisable ] ---

	/**
	 * Disables an option for a rendering context.
	 *
	 * @param ctx   a rendering context
	 * @param pname the option to disable. One of:<br>{@link #kCGLCESwapRectangle CESwapRectangle}, {@link #kCGLCESwapLimit CESwapLimit}, {@link #kCGLCERasterization CERasterization}, {@link #kCGLCEStateValidation CEStateValidation}, {@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}, {@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}, {@link #kCGLCEMPEngine CEMPEngine}
	 */
	public static int CGLDisable(long ctx, int pname) {
		long __functionAddress = getInstance().Disable;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPII(__functionAddress, ctx, pname);
	}

	// --- [ CGLIsEnabled ] ---

	/** Unsafe version of {@link #CGLIsEnabled IsEnabled} */
	@JavadocExclude
	public static int nCGLIsEnabled(long ctx, int pname, long enable) {
		long __functionAddress = getInstance().IsEnabled;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPIPI(__functionAddress, ctx, pname, enable);
	}

	/**
	 * Reports whether an option is enabled for a rendering context.
	 *
	 * @param ctx    a rendering context
	 * @param pname  the option to query. One of:<br>{@link #kCGLCESwapRectangle CESwapRectangle}, {@link #kCGLCESwapLimit CESwapLimit}, {@link #kCGLCERasterization CERasterization}, {@link #kCGLCEStateValidation CEStateValidation}, {@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}, {@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}, {@link #kCGLCEMPEngine CEMPEngine}
	 * @param enable on return, enable is set to true if the option is enabled
	 */
	public static int CGLIsEnabled(long ctx, int pname, ByteBuffer enable) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(enable, 1 << 2);
		return nCGLIsEnabled(ctx, pname, memAddress(enable));
	}

	/** Alternative version of: {@link #CGLIsEnabled IsEnabled} */
	public static int CGLIsEnabled(long ctx, int pname, IntBuffer enable) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(enable, 1);
		return nCGLIsEnabled(ctx, pname, memAddress(enable));
	}

	// --- [ CGLSetParameter ] ---

	/** Unsafe version of {@link #CGLSetParameter SetParameter} */
	@JavadocExclude
	public static int nCGLSetParameter(long ctx, int pname, long params) {
		long __functionAddress = getInstance().SetParameter;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPIPI(__functionAddress, ctx, pname, params);
	}

	/**
	 * Sets the value of a rendering context parameter.
	 *
	 * @param ctx    a rendering context
	 * @param pname  the parameter whose value you want to set. One of:<br>{@link #kCGLCPSwapRectangle CPSwapRectangle}, {@link #kCGLCPSwapInterval CPSwapInterval}, {@link #kCGLCPDispatchTableSize CPDispatchTableSize}, {@link #kCGLCPClientStorage CPClientStorage}, {@link #kCGLCPSurfaceTexture CPSurfaceTexture}, {@link #kCGLCPSurfaceOrder CPSurfaceOrder}, {@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}, {@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}, {@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}, {@link #kCGLCPReclaimResources CPReclaimResources}, {@link #kCGLCPCurrentRendererID CPCurrentRendererID}, {@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}, {@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}, {@link #kCGLCPHasDrawable CPHasDrawable}, {@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}
	 * @param params a pointer to the value to set the parameter to
	 */
	public static int CGLSetParameter(long ctx, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		return nCGLSetParameter(ctx, pname, memAddress(params));
	}

	/** Alternative version of: {@link #CGLSetParameter SetParameter} */
	public static int CGLSetParameter(long ctx, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		return nCGLSetParameter(ctx, pname, memAddress(params));
	}

	/** Single value version of: {@link #CGLSetParameter SetParameter} */
	public static int CGLSetParameter(long ctx, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		return nCGLSetParameter(ctx, pname, __buffer.address(params));
	}

	// --- [ CGLGetParameter ] ---

	/** Unsafe version of {@link #CGLGetParameter GetParameter} */
	@JavadocExclude
	public static int nCGLGetParameter(long ctx, int pname, long params) {
		long __functionAddress = getInstance().GetParameter;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPIPI(__functionAddress, ctx, pname, params);
	}

	/**
	 * Retrieves the value of a rendering context parameter.
	 *
	 * @param ctx    a rendering context
	 * @param pname  the parameter whose value you want to retrieve. One of:<br>{@link #kCGLCPSwapRectangle CPSwapRectangle}, {@link #kCGLCPSwapInterval CPSwapInterval}, {@link #kCGLCPDispatchTableSize CPDispatchTableSize}, {@link #kCGLCPClientStorage CPClientStorage}, {@link #kCGLCPSurfaceTexture CPSurfaceTexture}, {@link #kCGLCPSurfaceOrder CPSurfaceOrder}, {@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}, {@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}, {@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}, {@link #kCGLCPReclaimResources CPReclaimResources}, {@link #kCGLCPCurrentRendererID CPCurrentRendererID}, {@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}, {@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}, {@link #kCGLCPHasDrawable CPHasDrawable}, {@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}
	 * @param params on return, points to the value of the parameter
	 */
	public static int CGLGetParameter(long ctx, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		return nCGLGetParameter(ctx, pname, memAddress(params));
	}

	/** Alternative version of: {@link #CGLGetParameter GetParameter} */
	public static int CGLGetParameter(long ctx, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		return nCGLGetParameter(ctx, pname, memAddress(params));
	}

	// --- [ CGLSetVirtualScreen ] ---

	/**
	 * Forces subsequent OpenGL commands to the specified virtual screen.
	 * 
	 * <p>Setting the virtual screen forces the renderer associated with the virtual screen to process OpenGL commands issued to the specified context. Changing
	 * the virtual screen changes the current renderer. You should use this function only when it is necessary to override the default behavior. The current
	 * virtual screen is normally set automatically. Because the current virtual screen determines which OpenGL renderer is processing commands, the return
	 * values of all glGetXXX functions can be affected by the current virtual screen.</p>
	 *
	 * @param ctx    a rendering context
	 * @param screen a virtual screen number, which must be a value between 0 and the number of virtual screens minus one. The number of virtual screens available in a
	 *               context can be obtained by calling the function {@link #CGLDescribePixelFormat DescribePixelFormat}, passing in the pixel format object used to create the rendering
	 *               context, 0 for the virtual screen number ({@code pix_num} parameter), and the attribute constant {@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}.
	 */
	public static int CGLSetVirtualScreen(long ctx, int screen) {
		long __functionAddress = getInstance().SetVirtualScreen;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPII(__functionAddress, ctx, screen);
	}

	// --- [ CGLGetVirtualScreen ] ---

	/** Unsafe version of {@link #CGLGetVirtualScreen GetVirtualScreen} */
	@JavadocExclude
	public static int nCGLGetVirtualScreen(long ctx, long screen) {
		long __functionAddress = getInstance().GetVirtualScreen;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPPI(__functionAddress, ctx, screen);
	}

	/**
	 * Gets the current virtual screen number associated with a rendering context.
	 * 
	 * <p>The current virtual screen can change when a drawable object is moved or resized across graphics device boundaries. A change in the current virtual
	 * screen can affect the return values of some OpenGL functions and in most cases also means that the renderer has changed.</p>
	 *
	 * @param ctx    a rendering context
	 * @param screen on return, points to the virtual screen associated with the context. The value is always 0 on a single-display system and –1 if the function fails
	 *               for any reason.
	 */
	public static int CGLGetVirtualScreen(long ctx, ByteBuffer screen) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(screen, 1 << 2);
		return nCGLGetVirtualScreen(ctx, memAddress(screen));
	}

	/** Alternative version of: {@link #CGLGetVirtualScreen GetVirtualScreen} */
	public static int CGLGetVirtualScreen(long ctx, IntBuffer screen) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(screen, 1);
		return nCGLGetVirtualScreen(ctx, memAddress(screen));
	}

	// --- [ CGLUpdateContext ] ---

	/**
	 * Synchronizes new renderer state to that of the application context
	 *
	 * @param ctx a rendering context
	 */
	public static int CGLUpdateContext(long ctx) {
		long __functionAddress = getInstance().UpdateContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return callPI(__functionAddress, ctx);
	}

	// --- [ CGLSetGlobalOption ] ---

	/** Unsafe version of {@link #CGLSetGlobalOption SetGlobalOption} */
	@JavadocExclude
	public static int nCGLSetGlobalOption(int pname, long params) {
		long __functionAddress = getInstance().SetGlobalOption;
		return callIPI(__functionAddress, pname, params);
	}

	/**
	 * Sets the value of a global option.
	 *
	 * @param pname  the name of the option whose value you want to set. One of:<br>{@link #kCGLGOFormatCacheSize GOFormatCacheSize}, {@link #kCGLGOClearFormatCache GOClearFormatCache}, {@link #kCGLGORetainRenderers GORetainRenderers}, {@link #kCGLGOResetLibrary GOResetLibrary}, {@link #kCGLGOUseErrorHandler GOUseErrorHandler}, {@link #kCGLGOUseBuildCache GOUseBuildCache}
	 * @param params the value to set the option to
	 */
	public static int CGLSetGlobalOption(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		return nCGLSetGlobalOption(pname, memAddress(params));
	}

	/** Alternative version of: {@link #CGLSetGlobalOption SetGlobalOption} */
	public static int CGLSetGlobalOption(int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		return nCGLSetGlobalOption(pname, memAddress(params));
	}

	/** Single value version of: {@link #CGLSetGlobalOption SetGlobalOption} */
	public static int CGLSetGlobalOption(int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		return nCGLSetGlobalOption(pname, __buffer.address(params));
	}

	// --- [ CGLGetGlobalOption ] ---

	/** Unsafe version of {@link #CGLGetGlobalOption GetGlobalOption} */
	@JavadocExclude
	public static int nCGLGetGlobalOption(int pname, long params) {
		long __functionAddress = getInstance().GetGlobalOption;
		return callIPI(__functionAddress, pname, params);
	}

	/**
	 * Retrieves the value of a global option.
	 *
	 * @param pname  the name of the option whose value you want to get. One of:<br>{@link #kCGLGOFormatCacheSize GOFormatCacheSize}, {@link #kCGLGOClearFormatCache GOClearFormatCache}, {@link #kCGLGORetainRenderers GORetainRenderers}, {@link #kCGLGOResetLibrary GOResetLibrary}, {@link #kCGLGOUseErrorHandler GOUseErrorHandler}, {@link #kCGLGOUseBuildCache GOUseBuildCache}
	 * @param params on return, a pointer to the value of the option
	 */
	public static int CGLGetGlobalOption(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		return nCGLGetGlobalOption(pname, memAddress(params));
	}

	/** Alternative version of: {@link #CGLGetGlobalOption GetGlobalOption} */
	public static int CGLGetGlobalOption(int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		return nCGLGetGlobalOption(pname, memAddress(params));
	}

	// --- [ CGLLockContext ] ---

	/**
	 * Locks a CGL rendering context.
	 * 
	 * <p>The function CGLLockContext blocks the thread it is on until all other threads have unlocked the same context using the function
	 * {@link #CGLUnlockContext UnlockContext}. You can use CGLLockContext recursively. Context-specific CGL calls by themselves do not require locking, but you can
	 * guarantee serial processing for a group of calls by surrounding them with CGLLockContext and CGLUnlockContext. Keep in mind that calls from the OpenGL
	 * API (the API provided by the Architecture Review Board) require locking.</p>
	 * 
	 * <p>Applications that use NSOpenGL classes with multithreading can lock contexts using the functions CGLLockContext and CGLUnlockContext. To perform
	 * rendering in a thread other than the main one, you can lock the context that you want to access and safely execute OpenGL commands. The locking calls
	 * must be placed around all OpenGL calls in all threads.</p>
	 *
	 * @param context a rendering context
	 */
	public static int CGLLockContext(long context) {
		long __functionAddress = getInstance().LockContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return callPI(__functionAddress, context);
	}

	// --- [ CGLUnlockContext ] ---

	/**
	 * Unlocks a CGL rendering context.
	 *
	 * @param context the CGL context to unlock
	 */
	public static int CGLUnlockContext(long context) {
		long __functionAddress = getInstance().UnlockContext;
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return callPI(__functionAddress, context);
	}

	// --- [ CGLGetVersion ] ---

	/** Unsafe version of {@link #CGLGetVersion GetVersion} */
	@JavadocExclude
	public static void nCGLGetVersion(long majorvers, long minorvers) {
		long __functionAddress = getInstance().GetVersion;
		callPPV(__functionAddress, majorvers, minorvers);
	}

	/**
	 * Gets the major and minor version numbers of the CGL library.
	 *
	 * @param majorvers on return, points to the major version number of the CGL library
	 * @param minorvers on return, points to the minor version number of the CGL library
	 */
	public static void CGLGetVersion(ByteBuffer majorvers, ByteBuffer minorvers) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(majorvers, 1 << 2);
			checkBuffer(minorvers, 1 << 2);
		}
		nCGLGetVersion(memAddress(majorvers), memAddress(minorvers));
	}

	/** Alternative version of: {@link #CGLGetVersion GetVersion} */
	public static void CGLGetVersion(IntBuffer majorvers, IntBuffer minorvers) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(majorvers, 1);
			checkBuffer(minorvers, 1);
		}
		nCGLGetVersion(memAddress(majorvers), memAddress(minorvers));
	}

	// --- [ CGLErrorString ] ---

	/** Unsafe version of {@link #CGLErrorString ErrorString} */
	@JavadocExclude
	public static long nCGLErrorString(int error) {
		long __functionAddress = getInstance().ErrorString;
		return callIP(__functionAddress, error);
	}

	/**
	 * Returns a string that describes the specified result code.
	 *
	 * @param error the CGL result code constant returned from a CGL function. One of:<br>{@link #kCGLNoError NoError}, {@link #kCGLBadAttribute BadAttribute}, {@link #kCGLBadProperty BadProperty}, {@link #kCGLBadPixelFormat BadPixelFormat}, {@link #kCGLBadRendererInfo BadRendererInfo}, {@link #kCGLBadContext BadContext}, {@link #kCGLBadDrawable BadDrawable}, {@link #kCGLBadDisplay BadDisplay}, {@link #kCGLBadState BadState}, {@link #kCGLBadValue BadValue}, {@link #kCGLBadMatch BadMatch}, {@link #kCGLBadEnumeration BadEnumeration}, {@link #kCGLBadOffScreen BadOffScreen}, {@link #kCGLBadFullScreen BadFullScreen}, {@link #kCGLBadWindow BadWindow}, {@link #kCGLBadAddress BadAddress}, {@link #kCGLBadCodeModule BadCodeModule}, {@link #kCGLBadAlloc BadAlloc}, {@link #kCGLBadConnection BadConnection}
	 */
	public static String CGLErrorString(int error) {
		long __result = nCGLErrorString(error);
		return memDecodeASCII(__result);
	}

}