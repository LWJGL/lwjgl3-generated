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

	static { LWJGLUtil.initialize(); }

	private CGL() {}

	// --- [ CGLGetCurrentContext ] ---

	/** Returns the current rendering context. If there is none, returns {@code NULL}. */
	public static native long CGLGetCurrentContext();

	// --- [ CGLSetCurrentContext ] ---

	/** JNI method for {@link #CGLSetCurrentContext SetCurrentContext} */
	@JavadocExclude
	public static native int nCGLSetCurrentContext(long context);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nCGLSetCurrentContext(context);
	}

	// --- [ CGLGetShareGroup ] ---

	/** JNI method for {@link #CGLGetShareGroup GetShareGroup} */
	@JavadocExclude
	public static native long nCGLGetShareGroup(long ctx);

	/**
	 * Returns the sharegroup of the specified rendering context.
	 *
	 * @param ctx a rendering context
	 */
	public static long CGLGetShareGroup(long ctx) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLGetShareGroup(ctx);
	}

	// --- [ CGLChoosePixelFormat ] ---

	/** JNI method for {@link #CGLChoosePixelFormat ChoosePixelFormat} */
	@JavadocExclude
	public static native int nCGLChoosePixelFormat(long attribs, long pix, long npix);

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

	/** JNI method for {@link #CGLDestroyPixelFormat DestroyPixelFormat} */
	@JavadocExclude
	public static native int nCGLDestroyPixelFormat(long pix);

	/**
	 * Frees the memory associated with a pixel format object. Calling this function is equivalent to calling {@link #CGLReleasePixelFormat ReleasePixelFormat}.
	 *
	 * @param pix the pixel format object to destroy
	 */
	public static int CGLDestroyPixelFormat(long pix) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return nCGLDestroyPixelFormat(pix);
	}

	// --- [ CGLDescribePixelFormat ] ---

	/** JNI method for {@link #CGLDescribePixelFormat DescribePixelFormat} */
	@JavadocExclude
	public static native int nCGLDescribePixelFormat(long pix, int pix_num, int attrib, long value);

	/**
	 * Retrieves the values of an attribute associated with a pixel format object.
	 *
	 * @param pix     the pixel format object to query
	 * @param pix_num the virtual screen number whose attribute value you want to retrieve. This value must be between 0 and the number of virtual screens minus one.
	 * @param attrib  the attribute whose value you want to obtain. One of:<br>{@link #kCGLPFAAllRenderers PFAAllRenderers}, {@link #kCGLPFATripleBuffer PFATripleBuffer}, {@link #kCGLPFADoubleBuffer PFADoubleBuffer}, {@link #kCGLPFAStereo PFAStereo}, {@link #kCGLPFAColorSize PFAColorSize}, {@link #kCGLPFAAlphaSize PFAAlphaSize}, {@link #kCGLPFADepthSize PFADepthSize}, {@link #kCGLPFAStencilSize PFAStencilSize}, {@link #kCGLPFAMinimumPolicy PFAMinimumPolicy}, {@link #kCGLPFAMaximumPolicy PFAMaximumPolicy}, {@link #kCGLPFASampleBuffers PFASampleBuffers}, {@link #kCGLPFASamples PFASamples}, {@link #kCGLPFAColorFloat PFAColorFloat}, {@link #kCGLPFAMultisample PFAMultisample}, {@link #kCGLPFASupersample PFASupersample}, {@link #kCGLPFASampleAlpha PFASampleAlpha}, {@link #kCGLPFARendererID PFARendererID}, {@link #kCGLPFASingleRenderer PFASingleRenderer}, {@link #kCGLPFANoRecovery PFANoRecovery}, {@link #kCGLPFAAccelerated PFAAccelerated}, {@link #kCGLPFAClosestPolicy PFAClosestPolicy}, {@link #kCGLPFABackingStore PFABackingStore}, {@link #kCGLPFABackingVolatile PFABackingVolatile}, {@link #kCGLPFADisplayMask PFADisplayMask}, {@link #kCGLPFAAllowOfflineRenderers PFAAllowOfflineRenderers}, {@link #kCGLPFAAcceleratedCompute PFAAcceleratedCompute}, {@link #kCGLPFAOpenGLProfile PFAOpenGLProfile}, {@link #kCGLPFASupportsAutomaticGraphicsSwitching PFASupportsAutomaticGraphicsSwitching}, {@link #kCGLPFAVirtualScreenCount PFAVirtualScreenCount}, {@link #kCGLPFAAuxBuffers PFAAuxBuffers}, {@link #kCGLPFAAccumSize PFAAccumSize}, {@link #kCGLPFAOffScreen PFAOffScreen}, {@link #kCGLPFAAuxDepthStencil PFAAuxDepthStencil}, {@link #kCGLPFAWindow PFAWindow}, {@link #kCGLPFACompliant PFACompliant}, {@link #kCGLPFAPBuffer PFAPBuffer}, {@link #kCGLPFARemotePBuffer PFARemotePBuffer}, {@link #kCGLPFARobust PFARobust}, {@link #kCGLPFAMPSafe PFAMPSafe}, {@link #kCGLPFAMultiScreen PFAMultiScreen}, {@link #kCGLPFAFullScreen PFAFullScreen}
	 * @param value   on return, points to the value of the attribute
	 */
	public static int CGLDescribePixelFormat(long pix, int pix_num, int attrib, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(pix);
			checkBuffer(value, 1 << 2);
		}
		return nCGLDescribePixelFormat(pix, pix_num, attrib, memAddress(value));
	}

	/** Alternative version of: {@link #CGLDescribePixelFormat DescribePixelFormat} */
	public static int CGLDescribePixelFormat(long pix, int pix_num, int attrib, IntBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(pix);
			checkBuffer(value, 1);
		}
		return nCGLDescribePixelFormat(pix, pix_num, attrib, memAddress(value));
	}

	// --- [ CGLReleasePixelFormat ] ---

	/** JNI method for {@link #CGLReleasePixelFormat ReleasePixelFormat} */
	@JavadocExclude
	public static native void nCGLReleasePixelFormat(long pix);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		nCGLReleasePixelFormat(pix);
	}

	// --- [ CGLRetainPixelFormat ] ---

	/** JNI method for {@link #CGLRetainPixelFormat RetainPixelFormat} */
	@JavadocExclude
	public static native long nCGLRetainPixelFormat(long pix);

	/**
	 * Increments the receiver's reference count.
	 * 
	 * <p>Each call to CGLRetainPixelFormat increases the reference count by 1. Each call to CGLRetainPixelFormat must be matched with a call to
	 * {@link #CGLReleasePixelFormat ReleasePixelFormat}.</p>
	 *
	 * @param pix the pixel format object whose reference count should be incremented
	 */
	public static long CGLRetainPixelFormat(long pix) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return nCGLRetainPixelFormat(pix);
	}

	// --- [ CGLGetPixelFormatRetainCount ] ---

	/** JNI method for {@link #CGLGetPixelFormatRetainCount GetPixelFormatRetainCount} */
	@JavadocExclude
	public static native int nCGLGetPixelFormatRetainCount(long pix);

	/**
	 * Returns the retain count of a pixel format object.
	 *
	 * @param pix a pixel format object
	 */
	public static int CGLGetPixelFormatRetainCount(long pix) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(pix);
		return nCGLGetPixelFormatRetainCount(pix);
	}

	// --- [ CGLQueryRendererInfo ] ---

	/** JNI method for {@link #CGLQueryRendererInfo QueryRendererInfo} */
	@JavadocExclude
	public static native int nCGLQueryRendererInfo(int display_mask, long rend, long nrend);

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

	/** JNI method for {@link #CGLDestroyRendererInfo DestroyRendererInfo} */
	@JavadocExclude
	public static native int nCGLDestroyRendererInfo(long rend);

	/**
	 * Frees resources associated with a renderer information object.
	 *
	 * @param rend the renderer information object to destroy
	 */
	public static int CGLDestroyRendererInfo(long rend) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(rend);
		return nCGLDestroyRendererInfo(rend);
	}

	// --- [ CGLDescribeRenderer ] ---

	/** JNI method for {@link #CGLDescribeRenderer DescribeRenderer} */
	@JavadocExclude
	public static native int nCGLDescribeRenderer(long rend, int rend_num, int prop, long value);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(rend);
			checkBuffer(value, 1 << 2);
		}
		return nCGLDescribeRenderer(rend, rend_num, prop, memAddress(value));
	}

	/** Alternative version of: {@link #CGLDescribeRenderer DescribeRenderer} */
	public static int CGLDescribeRenderer(long rend, int rend_num, int prop, IntBuffer value) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(rend);
			checkBuffer(value, 1);
		}
		return nCGLDescribeRenderer(rend, rend_num, prop, memAddress(value));
	}

	// --- [ CGLCreateContext ] ---

	/** JNI method for {@link #CGLCreateContext CreateContext} */
	@JavadocExclude
	public static native int nCGLCreateContext(long pix, long share, long ctx);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(pix);
			checkPointer(share);
			checkBuffer(ctx, 1 << POINTER_SHIFT);
		}
		return nCGLCreateContext(pix, share, memAddress(ctx));
	}

	/** Alternative version of: {@link #CGLCreateContext CreateContext} */
	public static int CGLCreateContext(long pix, long share, PointerBuffer ctx) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(pix);
			checkPointer(share);
			checkBuffer(ctx, 1);
		}
		return nCGLCreateContext(pix, share, memAddress(ctx));
	}

	// --- [ CGLDestroyContext ] ---

	/** JNI method for {@link #CGLDestroyContext DestroyContext} */
	@JavadocExclude
	public static native int nCGLDestroyContext(long ctx);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLDestroyContext(ctx);
	}

	// --- [ CGLCopyContext ] ---

	/** JNI method for {@link #CGLCopyContext CopyContext} */
	@JavadocExclude
	public static native int nCGLCopyContext(long src, long dst, int mask);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(src);
			checkPointer(dst);
		}
		return nCGLCopyContext(src, dst, mask);
	}

	// --- [ CGLRetainContext ] ---

	/** JNI method for {@link #CGLRetainContext RetainContext} */
	@JavadocExclude
	public static native long nCGLRetainContext(long ctx);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLRetainContext(ctx);
	}

	// --- [ CGLReleaseContext ] ---

	/** JNI method for {@link #CGLReleaseContext ReleaseContext} */
	@JavadocExclude
	public static native void nCGLReleaseContext(long ctx);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		nCGLReleaseContext(ctx);
	}

	// --- [ CGLGetContextRetainCount ] ---

	/** JNI method for {@link #CGLGetContextRetainCount GetContextRetainCount} */
	@JavadocExclude
	public static native int nCGLGetContextRetainCount(long ctx);

	/**
	 * Returns the current retain count of a CGL rendering context.
	 *
	 * @param ctx the CGL rendering context whose retain count you wish to discover
	 */
	public static int CGLGetContextRetainCount(long ctx) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLGetContextRetainCount(ctx);
	}

	// --- [ CGLGetPixelFormat ] ---

	/** JNI method for {@link #CGLGetPixelFormat GetPixelFormat} */
	@JavadocExclude
	public static native long nCGLGetPixelFormat(long ctx);

	/**
	 * Retrieves the current pixel format associated with a CGL rendering context.
	 * 
	 * <p>The pixel format object is not retained before being returned to your application. If your application needs to maintain this object, it should call
	 * {@link #CGLRetainPixelFormat RetainPixelFormat}.</p>
	 *
	 * @param ctx the CGL rendering context whose format you want to receive
	 */
	public static long CGLGetPixelFormat(long ctx) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLGetPixelFormat(ctx);
	}

	// --- [ CGLClearDrawable ] ---

	/** JNI method for {@link #CGLClearDrawable ClearDrawable} */
	@JavadocExclude
	public static native int nCGLClearDrawable(long ctx);

	/**
	 * Disassociates a rendering context from any drawable objects attached to it.
	 *
	 * @param ctx a rendering context
	 */
	public static int CGLClearDrawable(long ctx) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLClearDrawable(ctx);
	}

	// --- [ CGLFlushDrawable ] ---

	/** JNI method for {@link #CGLFlushDrawable FlushDrawable} */
	@JavadocExclude
	public static native int nCGLFlushDrawable(long ctx);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLFlushDrawable(ctx);
	}

	// --- [ CGLEnable ] ---

	/** JNI method for {@link #CGLEnable Enable} */
	@JavadocExclude
	public static native int nCGLEnable(long ctx, int pname);

	/**
	 * Enables an option for a rendering context.
	 *
	 * @param ctx   a rendering context
	 * @param pname the option to enable. One of:<br>{@link #kCGLCESwapRectangle CESwapRectangle}, {@link #kCGLCESwapLimit CESwapLimit}, {@link #kCGLCERasterization CERasterization}, {@link #kCGLCEStateValidation CEStateValidation}, {@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}, {@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}, {@link #kCGLCEMPEngine CEMPEngine}
	 */
	public static int CGLEnable(long ctx, int pname) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLEnable(ctx, pname);
	}

	// --- [ CGLDisable ] ---

	/** JNI method for {@link #CGLDisable Disable} */
	@JavadocExclude
	public static native int nCGLDisable(long ctx, int pname);

	/**
	 * Disables an option for a rendering context.
	 *
	 * @param ctx   a rendering context
	 * @param pname the option to disable. One of:<br>{@link #kCGLCESwapRectangle CESwapRectangle}, {@link #kCGLCESwapLimit CESwapLimit}, {@link #kCGLCERasterization CERasterization}, {@link #kCGLCEStateValidation CEStateValidation}, {@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}, {@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}, {@link #kCGLCEMPEngine CEMPEngine}
	 */
	public static int CGLDisable(long ctx, int pname) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLDisable(ctx, pname);
	}

	// --- [ CGLIsEnabled ] ---

	/** JNI method for {@link #CGLIsEnabled IsEnabled} */
	@JavadocExclude
	public static native int nCGLIsEnabled(long ctx, int pname, long enable);

	/**
	 * Reports whether an option is enabled for a rendering context.
	 *
	 * @param ctx    a rendering context
	 * @param pname  the option to query. One of:<br>{@link #kCGLCESwapRectangle CESwapRectangle}, {@link #kCGLCESwapLimit CESwapLimit}, {@link #kCGLCERasterization CERasterization}, {@link #kCGLCEStateValidation CEStateValidation}, {@link #kCGLCESurfaceBackingSize CESurfaceBackingSize}, {@link #kCGLCEDisplayListOptimization CEDisplayListOptimization}, {@link #kCGLCEMPEngine CEMPEngine}
	 * @param enable on return, enable is set to true if the option is enabled
	 */
	public static int CGLIsEnabled(long ctx, int pname, ByteBuffer enable) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(enable, 1 << 2);
		}
		return nCGLIsEnabled(ctx, pname, memAddress(enable));
	}

	/** Alternative version of: {@link #CGLIsEnabled IsEnabled} */
	public static int CGLIsEnabled(long ctx, int pname, IntBuffer enable) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(enable, 1);
		}
		return nCGLIsEnabled(ctx, pname, memAddress(enable));
	}

	// --- [ CGLSetParameter ] ---

	/** JNI method for {@link #CGLSetParameter SetParameter} */
	@JavadocExclude
	public static native int nCGLSetParameter(long ctx, int pname, long params);

	/**
	 * Sets the value of a rendering context parameter.
	 *
	 * @param ctx    a rendering context
	 * @param pname  the parameter whose value you want to set. One of:<br>{@link #kCGLCPSwapRectangle CPSwapRectangle}, {@link #kCGLCPSwapInterval CPSwapInterval}, {@link #kCGLCPDispatchTableSize CPDispatchTableSize}, {@link #kCGLCPClientStorage CPClientStorage}, {@link #kCGLCPSurfaceTexture CPSurfaceTexture}, {@link #kCGLCPSurfaceOrder CPSurfaceOrder}, {@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}, {@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}, {@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}, {@link #kCGLCPReclaimResources CPReclaimResources}, {@link #kCGLCPCurrentRendererID CPCurrentRendererID}, {@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}, {@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}, {@link #kCGLCPHasDrawable CPHasDrawable}, {@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}
	 * @param params a pointer to the value to set the parameter to
	 */
	public static int CGLSetParameter(long ctx, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(params, 1 << 2);
		}
		return nCGLSetParameter(ctx, pname, memAddress(params));
	}

	/** Alternative version of: {@link #CGLSetParameter SetParameter} */
	public static int CGLSetParameter(long ctx, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(params, 1);
		}
		return nCGLSetParameter(ctx, pname, memAddress(params));
	}

	/** Single value version of: {@link #CGLSetParameter SetParameter} */
	public static int CGLSetParameter(long ctx, int pname, int param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		return nCGLSetParameter(ctx, pname, __buffer.address(params));
	}

	// --- [ CGLGetParameter ] ---

	/** JNI method for {@link #CGLGetParameter GetParameter} */
	@JavadocExclude
	public static native int nCGLGetParameter(long ctx, int pname, long params);

	/**
	 * Retrieves the value of a rendering context parameter.
	 *
	 * @param ctx    a rendering context
	 * @param pname  the parameter whose value you want to retrieve. One of:<br>{@link #kCGLCPSwapRectangle CPSwapRectangle}, {@link #kCGLCPSwapInterval CPSwapInterval}, {@link #kCGLCPDispatchTableSize CPDispatchTableSize}, {@link #kCGLCPClientStorage CPClientStorage}, {@link #kCGLCPSurfaceTexture CPSurfaceTexture}, {@link #kCGLCPSurfaceOrder CPSurfaceOrder}, {@link #kCGLCPSurfaceOpacity CPSurfaceOpacity}, {@link #kCGLCPSurfaceBackingSize CPSurfaceBackingSize}, {@link #kCGLCPSurfaceSurfaceVolatile CPSurfaceSurfaceVolatile}, {@link #kCGLCPReclaimResources CPReclaimResources}, {@link #kCGLCPCurrentRendererID CPCurrentRendererID}, {@link #kCGLCPGPUVertexProcessing CPGPUVertexProcessing}, {@link #kCGLCPGPUFragmentProcessing CPGPUFragmentProcessing}, {@link #kCGLCPHasDrawable CPHasDrawable}, {@link #kCGLCPMPSwapsInFlight CPMPSwapsInFlight}
	 * @param params on return, points to the value of the parameter
	 */
	public static int CGLGetParameter(long ctx, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(params, 1 << 2);
		}
		return nCGLGetParameter(ctx, pname, memAddress(params));
	}

	/** Alternative version of: {@link #CGLGetParameter GetParameter} */
	public static int CGLGetParameter(long ctx, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(params, 1);
		}
		return nCGLGetParameter(ctx, pname, memAddress(params));
	}

	// --- [ CGLSetVirtualScreen ] ---

	/** JNI method for {@link #CGLSetVirtualScreen SetVirtualScreen} */
	@JavadocExclude
	public static native int nCGLSetVirtualScreen(long ctx, int screen);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLSetVirtualScreen(ctx, screen);
	}

	// --- [ CGLGetVirtualScreen ] ---

	/** JNI method for {@link #CGLGetVirtualScreen GetVirtualScreen} */
	@JavadocExclude
	public static native int nCGLGetVirtualScreen(long ctx, long screen);

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
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(screen, 1 << 2);
		}
		return nCGLGetVirtualScreen(ctx, memAddress(screen));
	}

	/** Alternative version of: {@link #CGLGetVirtualScreen GetVirtualScreen} */
	public static int CGLGetVirtualScreen(long ctx, IntBuffer screen) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(ctx);
			checkBuffer(screen, 1);
		}
		return nCGLGetVirtualScreen(ctx, memAddress(screen));
	}

	// --- [ CGLUpdateContext ] ---

	/** JNI method for {@link #CGLUpdateContext UpdateContext} */
	@JavadocExclude
	public static native int nCGLUpdateContext(long ctx);

	/**
	 * 
	 *
	 * @param ctx a rendering context
	 */
	public static int CGLUpdateContext(long ctx) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(ctx);
		return nCGLUpdateContext(ctx);
	}

	// --- [ CGLSetGlobalOption ] ---

	/** JNI method for {@link #CGLSetGlobalOption SetGlobalOption} */
	@JavadocExclude
	public static native int nCGLSetGlobalOption(int pname, long params);

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

	/** JNI method for {@link #CGLGetGlobalOption GetGlobalOption} */
	@JavadocExclude
	public static native int nCGLGetGlobalOption(int pname, long params);

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

	/** JNI method for {@link #CGLLockContext LockContext} */
	@JavadocExclude
	public static native int nCGLLockContext(long context);

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
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nCGLLockContext(context);
	}

	// --- [ CGLUnlockContext ] ---

	/** JNI method for {@link #CGLUnlockContext UnlockContext} */
	@JavadocExclude
	public static native int nCGLUnlockContext(long context);

	/**
	 * Unlocks a CGL rendering context.
	 *
	 * @param context the CGL context to unlock
	 */
	public static int CGLUnlockContext(long context) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(context);
		return nCGLUnlockContext(context);
	}

	// --- [ CGLGetVersion ] ---

	/** JNI method for {@link #CGLGetVersion GetVersion} */
	@JavadocExclude
	public static native void nCGLGetVersion(long majorvers, long minorvers);

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

	/** JNI method for {@link #CGLErrorString ErrorString} */
	@JavadocExclude
	public static native long nCGLErrorString(int error);

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